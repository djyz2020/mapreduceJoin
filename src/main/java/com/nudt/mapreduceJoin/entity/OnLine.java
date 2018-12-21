package com.nudt.mapreduceJoin.entity;

public class OnLine{

    //宽带账号
    private String userId ;

    // 账户类型
    private String idType ;

    //业务代码
    private String pId ;

    //拨号所获得的IP地址
    private String userIpAddr ;

    //宽带接入服务器IP地址
    private String brasIpAddr ;

    //宽带接入服务器逻辑端口
    private String brasLogicPort;

    //用户上网网卡地址
    private String userNetAddr ;

    //用户上线时间
    private String userLoginTime ;

    public OnLine(){
        super();
    }

    /**
     *
     * @param userId 宽带账号
     * @param idType 账户类型
     * @param pId 业务代码
     * @param userIpAddr 拨号所获得的IP地址
     * @param brasIpAddr 宽带接入服务器IP地址
     * @param brasLogicPort 用户上网网卡地址
     * @param userNetAddr 用户上网网卡地址
     * @param userLoginTime 用户上线时间
     */
    public OnLine(String userId, String idType, String pId, String userIpAddr, String brasIpAddr, String brasLogicPort, String userNetAddr, String userLoginTime) {
        this.userId = userId;
        this.pId = pId;
        this.idType = idType;
        this.pId = pId;
        this.userIpAddr = userIpAddr;
        this.brasIpAddr = brasIpAddr;
        this.brasLogicPort = brasLogicPort;
        this.userNetAddr = userNetAddr;
    }


    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getUserIpAddr() {
        return userIpAddr;
    }

    public void setUserIpAddr(String userIpAddr) {
        this.userIpAddr = userIpAddr;
    }

    public String getBrasIpAddr() {
        return brasIpAddr;
    }

    public void setBrasIpAddr(String brasIpAddr) {
        this.brasIpAddr = brasIpAddr;
    }

    public String getBrasLogicPort() {
        return brasLogicPort;
    }

    public void setBrasLogicPort(String brasLogicPort) {
        this.brasLogicPort = brasLogicPort;
    }

    public String getUserNetAddr() {
        return userNetAddr;
    }

    public void setUserNetAddr(String userNetAddr) {
        this.userNetAddr = userNetAddr;
    }

}
