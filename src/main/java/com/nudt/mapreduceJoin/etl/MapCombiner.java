package com.nudt.mapreduceJoin.etl;

import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;

/**
 * Created by haibozhang on 2018/12/21.
 */
public class MapCombiner extends Reducer {

    @Override
    protected void reduce(Object key, Iterable values, Context context) throws IOException, InterruptedException {
        super.reduce(key, values, context);
    }

}
