package com.nudt.mapreduceJoin.entity;

public class Topo {

    //用户账号
    private String custId ;

    //用户姓名
    private String suerName;

    //宽带拨入号
    private String braNo ;

    //区域本地网编号
    private String areaId;

    //用户联系电话
    private String contract;

    //用户地址
    private String userAddr ;

    //用户等级
    private String userLevel;

    //用户开通服务时间
    private String userOpenTime ;

    //用户宽带账号
    private String userBdAcct;

    //用户ITV账号
    private String userItvAcct;

    //BRAS的IP地址
    private String brasDevIp;

    //经由的BRAS的逻辑端口IP
    private String brasDevDport;

    //汇聚层设备的IP地址
    private String swDevIp;

    //汇聚层设备上行端口IP
    private String swDevUport;

    //汇聚层设备下行端口IP
    private String swDevDport;

    //OLT设备的IP地址
    private String oltDevIp;

    //OLT设备上行端口IP
    private String oltDevUport;

    //OLT设备下行端口IP
    private String oltDevDport;

    //服务虚拟局域网的ID
    private String svlan;

    //客户虚机局域网的ID
    private String cvlan;

    //光猫逻辑ID
    private String onuLogicId;

    //用户家庭网关ID
    private String familyNgId;

    //用户家庭网关型号
    private String familyNgTypeName;

    //用户设备MAC
    private String userDevMac;

    //OBD2名称
    private String obd2Name ;

    //OBD1名称
    private String obd1Name;

    //宽带接入方式 取值可能 FTTH/ADSL
    private String bam;

    //用户套餐类型
    private String userServicePackage;

    public Topo(){super();}

    /**
     *
     * @param custId 用户账号
     * @param suerName
     * @param braNo
     * @param areaId
     * @param contract
     * @param userAddr
     * @param userLevel
     * @param userOpenTime
     * @param userBdAcct
     * @param userItvAcct
     * @param brasDevIp
     * @param brasDevDport
     * @param swDevIp
     * @param swDevUport
     * @param swDevDport
     * @param oltDevIp
     * @param oltDevUport
     * @param oltDevDport
     * @param svlan
     * @param cvlan
     * @param onuLogicId
     * @param familyNgId
     * @param familyNgTypeName
     * @param userDevMac
     * @param obd2Name
     * @param obd1Name
     * @param bam
     * @param userServicePackage
     */
    public Topo(String custId, String suerName, String braNo, String areaId, String contract, String userAddr, String userLevel, String userOpenTime, String userBdAcct, String userItvAcct, String brasDevIp, String brasDevDport, String swDevIp, String swDevUport, String swDevDport, String oltDevIp, String oltDevUport, String oltDevDport, String svlan, String cvlan, String onuLogicId, String familyNgId, String familyNgTypeName, String userDevMac, String obd2Name, String obd1Name, String bam, String userServicePackage) {
        this.custId = custId;
        this.suerName = suerName;
        this.braNo = braNo;
        this.areaId = areaId;
        this.contract = contract;
        this.userAddr = userAddr;
        this.userLevel = userLevel;
        this.userOpenTime = userOpenTime;
        this.userBdAcct = userBdAcct;
        this.userItvAcct = userItvAcct;
        this.brasDevIp = brasDevIp;
        this.brasDevDport = brasDevDport;
        this.swDevIp = swDevIp;
        this.swDevUport = swDevUport;
        this.swDevDport = swDevDport;
        this.oltDevIp = oltDevIp;
        this.oltDevUport = oltDevUport;
        this.oltDevDport = oltDevDport;
        this.svlan = svlan;
        this.cvlan = cvlan;
        this.onuLogicId = onuLogicId;
        this.familyNgId = familyNgId;
        this.familyNgTypeName = familyNgTypeName;
        this.userDevMac = userDevMac;
        this.obd2Name = obd2Name;
        this.obd1Name = obd1Name;
        this.bam = bam;
        this.userServicePackage = userServicePackage;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getSuerName() {
        return suerName;
    }

    public void setSuerName(String suerName) {
        this.suerName = suerName;
    }

    public String getBraNo() {
        return braNo;
    }

    public void setBraNo(String braNo) {
        this.braNo = braNo;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserOpenTime() {
        return userOpenTime;
    }

    public void setUserOpenTime(String userOpenTime) {
        this.userOpenTime = userOpenTime;
    }

    public String getUserBdAcct() {
        return userBdAcct;
    }

    public void setUserBdAcct(String userBdAcct) {
        this.userBdAcct = userBdAcct;
    }

    public String getUserItvAcct() {
        return userItvAcct;
    }

    public void setUserItvAcct(String userItvAcct) {
        this.userItvAcct = userItvAcct;
    }

    public String getBrasDevIp() {
        return brasDevIp;
    }

    public void setBrasDevIp(String brasDevIp) {
        this.brasDevIp = brasDevIp;
    }

    public String getBrasDevDport() {
        return brasDevDport;
    }

    public void setBrasDevDport(String brasDevDport) {
        this.brasDevDport = brasDevDport;
    }

    public String getSwDevIp() {
        return swDevIp;
    }

    public void setSwDevIp(String swDevIp) {
        this.swDevIp = swDevIp;
    }

    public String getSwDevUport() {
        return swDevUport;
    }

    public void setSwDevUport(String swDevUport) {
        this.swDevUport = swDevUport;
    }

    public String getSwDevDport() {
        return swDevDport;
    }

    public void setSwDevDport(String swDevDport) {
        this.swDevDport = swDevDport;
    }

    public String getOltDevIp() {
        return oltDevIp;
    }

    public void setOltDevIp(String oltDevIp) {
        this.oltDevIp = oltDevIp;
    }

    public String getOltDevUport() {
        return oltDevUport;
    }

    public void setOltDevUport(String oltDevUport) {
        this.oltDevUport = oltDevUport;
    }

    public String getOltDevDport() {
        return oltDevDport;
    }

    public void setOltDevDport(String oltDevDport) {
        this.oltDevDport = oltDevDport;
    }

    public String getSvlan() {
        return svlan;
    }

    public void setSvlan(String svlan) {
        this.svlan = svlan;
    }

    public String getCvlan() {
        return cvlan;
    }

    public void setCvlan(String cvlan) {
        this.cvlan = cvlan;
    }

    public String getOnuLogicId() {
        return onuLogicId;
    }

    public void setOnuLogicId(String onuLogicId) {
        this.onuLogicId = onuLogicId;
    }

    public String getFamilyNgId() {
        return familyNgId;
    }

    public void setFamilyNgId(String familyNgId) {
        this.familyNgId = familyNgId;
    }

    public String getFamilyNgTypeName() {
        return familyNgTypeName;
    }

    public void setFamilyNgTypeName(String familyNgTypeName) {
        this.familyNgTypeName = familyNgTypeName;
    }

    public String getUserDevMac() {
        return userDevMac;
    }

    public void setUserDevMac(String userDevMac) {
        this.userDevMac = userDevMac;
    }

    public String getObd2Name() {
        return obd2Name;
    }

    public void setObd2Name(String obd2Name) {
        this.obd2Name = obd2Name;
    }

    public String getObd1Name() {
        return obd1Name;
    }

    public void setObd1Name(String obd1Name) {
        this.obd1Name = obd1Name;
    }

    public String getBam() {
        return bam;
    }

    public void setBam(String bam) {
        this.bam = bam;
    }

    public String getUserServicePackage() {
        return userServicePackage;
    }

    public void setUserServicePackage(String userServicePackage) {
        this.userServicePackage = userServicePackage;
    }
}
