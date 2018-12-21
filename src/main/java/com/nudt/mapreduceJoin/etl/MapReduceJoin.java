package com.nudt.mapreduceJoin.etl;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by haibozhang on 2018/12/21.
 */
public class MapReduceJoin extends Configured implements Tool{
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    // mapper算子
    public static class joinMapper extends Mapper<LongWritable, Text, Text, PairValue>{

        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            String record = value.toString(); //每一行的值
            if(record != null && record != ""){ //split
                PairValue pairValue = new PairValue("", "");
                String userId = "";
                if(record.indexOf("|") > 0){
                    String[] topoArr = record.split("\\|");
                    userId = topoArr[0];
                    pairValue.setMark("topo");
                    pairValue.setData("username=" + topoArr[1]);
                    context.write(new Text(userId), pairValue);
                }else{
                    String[] offlineArr = record.split(",");
                    userId = offlineArr[0];
                    pairValue.setMark("offline");
                    pairValue.setData(record);
                    context.write(new Text(userId), pairValue);
                }
            }
        }

    }

    // reducer算子
    public static class joinReducer extends Reducer<Text, PairValue, NullWritable, Text>{

        @Override
        protected void reduce(Text key, Iterable<PairValue> values, Context context) throws IOException, InterruptedException {
            List<String> offlineList = new ArrayList<>();
            String userInfo = "";
            Iterator<PairValue> iter = values.iterator();
            while(iter.hasNext()){
                PairValue pairValue = iter.next();
                if("offline".equals(pairValue.getMark())){
                    offlineList.add(pairValue.getData());
                }else if("topo".equals(pairValue.getMark())){
                    userInfo = pairValue.getData();
                }
            }
            if(userInfo != ""){
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(userInfo + " ");
                int count = 0;
                for(String offline : offlineList){
                    if(count == 0){
                        stringBuffer.append( " | ");
                        count++;
                    }
                    stringBuffer.append(offline);
                }
                context.write(NullWritable.get(), new Text(stringBuffer.toString()));
            }
        }
    }

    @Override
    public int run(String[] args) throws Exception {
        Configuration conf = this.getConf();
        Job job = Job.getInstance(conf, this.getClass().getName());
        //mapreduce的入口
        job.setJarByClass(this.getClass());

        FileInputFormat.addInputPaths(job, args[0]); //输入路径
        FileOutputFormat.setOutputPath(job, new Path(args[1] + "_" + sdf.format(new Date()) + "_" + System.currentTimeMillis()));

        job.setMapperClass(joinMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(PairValue.class);

        // mapper端优化
        // job.setPartitionerClass();
        // job.setSortComparatorClass();
        // job.setCombinerClass();

        job.setReducerClass(joinReducer.class);
        job.setOutputKeyClass(NullWritable.class);
        job.setOutputValueClass(Text.class);
        // reducer端优化
        // job.setGroupingComparatorClass();
        job.setNumReduceTasks(1);  // 设置reduce任务数

        // 提交任务至Yarn
        boolean isSuccess = job.waitForCompletion(true);

        return isSuccess ? 0 : 1;
    }

    public static void main(String[] args) {
//        args = new String[2];
//        args[0] = "file:///C:\\Users\\haibozhang\\Desktop\\mapreduceJoin\\src\\data\\input\\offline," +
//                "file:///C:\\Users\\haibozhang\\Desktop\\mapreduceJoin\\src\\data\\input\\topo";
//        args[1] = "file:///C:\\Users\\haibozhang\\Desktop\\mapreduceJoin\\src\\data\\output";

        try {
            Configuration conf = new Configuration();
            int status = ToolRunner.run(conf, new MapReduceJoin(), args);
            System.exit(status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
