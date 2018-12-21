package com.nudt.mapreduceJoin.entity;

public class OffLine{

    //用户账号
    private String userId ;

    //业务代码
    private String pId;

    //下线原因
    private String termCase;

    //用户在线时长
    private String sessinoTime ;

    //下线时间
    private String stopTime;

    public OffLine(){super();}

    public OffLine(String userId, String pId, String termCase, String sessinoTime, String stopTime) {
        this.userId = userId;
        this.pId = pId;
        this.pId = pId;
        this.termCase = termCase;
        this.sessinoTime = sessinoTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getTermCase() {
        return termCase;
    }

    public void setTermCase(String termCase) {
        this.termCase = termCase;
    }

    public String getSessinoTime() {
        return sessinoTime;
    }

    public void setSessinoTime(String sessinoTime) {
        this.sessinoTime = sessinoTime;
    }
}
