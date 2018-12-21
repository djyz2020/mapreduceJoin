package com.nudt.mapreduceJoin.etl;

import org.apache.hadoop.io.Writable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by haibozhang on 2018/12/21.
 */
public class PairValue implements Writable{

    private String mark;
    private String data;

    public PairValue(){}

    public PairValue(String mark, String data) {
        this.mark = mark;
        this.data = data;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeUTF(this.getMark());
        out.writeUTF(this.getData());
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.setMark(in.readUTF());
        this.setData(in.readUTF());
    }

    @Override
    public String toString() {
        return "PairValue{" +
                "mark='" + mark + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

}
