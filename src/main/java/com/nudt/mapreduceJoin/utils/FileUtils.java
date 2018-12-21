package com.nudt.mapreduceJoin.utils;

import java.io.*;

/**
 * Created by haibozhang on 2018/12/21.
 */
public class FileUtils {

    public static void readFile(String filePath, int num){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader =  new BufferedReader(new FileReader(new File(filePath)));
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                if(num < 30){
                    System.out.println(line);
                    num++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\haibozhang\\Desktop\\mapreduceJoin\\src\\data\\output_2018-12-21_1545372339903\\part-r-00000";
        FileUtils.readFile(filePath, 0);
    }

}
