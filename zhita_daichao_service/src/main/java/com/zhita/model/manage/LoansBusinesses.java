package com.zhita.model.manage;

import java.io.Serializable;
import java.math.BigDecimal;

//贷款商家表
public class LoansBusinesses implements Serializable{
    private Integer id;//贷款商家id

    private String businessname;//商家名称

    private String intro;//简介

    private BigDecimal loanlimit;//贷款额度

    private String trademark;//商标

    private String isstick;//是否置顶

    private Integer sort;//排序

    private Integer applicationnumber;//被申请次数

    private String state;//状态

    private String businessclassification;//商家分类

    private BigDecimal loanlimitsmall;//借款额度（小）

    private BigDecimal loanlimitbig;//借款额度（大）

    private String cycle;//周期

    private BigDecimal interestrate;//利率（%）

    private String applicationrequirements;//申请条件

    private String applicationprocess;//申请流程

    private String specialinstructions;//特别说明

    private Integer successrate;//成功率

    private Integer lendingrate;//放款速度

    private String registerlink;//注册链接

    private BigDecimal prepaidamount;//预付金额

    private String deleted;//假删除

    private Integer applications;//申请人数

    public LoansBusinesses(Integer id, String businessname, String intro, BigDecimal loanlimit, String trademark, String isstick, Integer sort, Integer applicationnumber, String state, String businessclassification, BigDecimal loanlimitsmall, BigDecimal loanlimitbig, String cycle, BigDecimal interestrate, String applicationrequirements, String applicationprocess, String specialinstructions, Integer successrate, Integer lendingrate, String registerlink, BigDecimal prepaidamount, String deleted, Integer applications) {
        this.id = id;
        this.businessname = businessname;
        this.intro = intro;
        this.loanlimit = loanlimit;
        this.trademark = trademark;
        this.isstick = isstick;
        this.sort = sort;
        this.applicationnumber = applicationnumber;
        this.state = state;
        this.businessclassification = businessclassification;
        this.loanlimitsmall = loanlimitsmall;
        this.loanlimitbig = loanlimitbig;
        this.cycle = cycle;
        this.interestrate = interestrate;
        this.applicationrequirements = applicationrequirements;
        this.applicationprocess = applicationprocess;
        this.specialinstructions = specialinstructions;
        this.successrate = successrate;
        this.lendingrate = lendingrate;
        this.registerlink = registerlink;
        this.prepaidamount = prepaidamount;
        this.deleted = deleted;
        this.applications = applications;
    }

    public LoansBusinesses() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname == null ? null : businessname.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public BigDecimal getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(BigDecimal loanlimit) {
        this.loanlimit = loanlimit;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark == null ? null : trademark.trim();
    }

    public String getIsstick() {
        return isstick;
    }

    public void setIsstick(String isstick) {
        this.isstick = isstick == null ? null : isstick.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getApplicationnumber() {
        return applicationnumber;
    }

    public void setApplicationnumber(Integer applicationnumber) {
        this.applicationnumber = applicationnumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBusinessclassification() {
        return businessclassification;
    }

    public void setBusinessclassification(String businessclassification) {
        this.businessclassification = businessclassification == null ? null : businessclassification.trim();
    }

    public BigDecimal getLoanlimitsmall() {
        return loanlimitsmall;
    }

    public void setLoanlimitsmall(BigDecimal loanlimitsmall) {
        this.loanlimitsmall = loanlimitsmall;
    }

    public BigDecimal getLoanlimitbig() {
        return loanlimitbig;
    }

    public void setLoanlimitbig(BigDecimal loanlimitbig) {
        this.loanlimitbig = loanlimitbig;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public BigDecimal getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(BigDecimal interestrate) {
        this.interestrate = interestrate;
    }

    public String getApplicationrequirements() {
        return applicationrequirements;
    }

    public void setApplicationrequirements(String applicationrequirements) {
        this.applicationrequirements = applicationrequirements == null ? null : applicationrequirements.trim();
    }

    public String getApplicationprocess() {
        return applicationprocess;
    }

    public void setApplicationprocess(String applicationprocess) {
        this.applicationprocess = applicationprocess == null ? null : applicationprocess.trim();
    }

    public String getSpecialinstructions() {
        return specialinstructions;
    }

    public void setSpecialinstructions(String specialinstructions) {
        this.specialinstructions = specialinstructions == null ? null : specialinstructions.trim();
    }

    public Integer getSuccessrate() {
        return successrate;
    }

    public void setSuccessrate(Integer successrate) {
        this.successrate = successrate;
    }

    public Integer getLendingrate() {
        return lendingrate;
    }

    public void setLendingrate(Integer lendingrate) {
        this.lendingrate = lendingrate;
    }

    public String getRegisterlink() {
        return registerlink;
    }

    public void setRegisterlink(String registerlink) {
        this.registerlink = registerlink == null ? null : registerlink.trim();
    }

    public BigDecimal getPrepaidamount() {
        return prepaidamount;
    }

    public void setPrepaidamount(BigDecimal prepaidamount) {
        this.prepaidamount = prepaidamount;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public Integer getApplications() {
        return applications;
    }

    public void setApplications(Integer applications) {
        this.applications = applications;
    }
}