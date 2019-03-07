package com.itbaizhan.pojo;

import java.util.Date;

public class CarriageContract {
    private Integer id;

    private String contractcode;

    private String drivername;

    private Integer driverid;

    private String sendgoodsaddr;

    private String receivegoodsaddr;

    private Date starttime;

    private Date endtime;

    private String receivecustomer;

    private Double totalfee;

    private Double insurance;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractcode() {
        return contractcode;
    }

    public void setContractcode(String contractcode) {
        this.contractcode = contractcode == null ? null : contractcode.trim();
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public String getSendgoodsaddr() {
        return sendgoodsaddr;
    }

    public void setSendgoodsaddr(String sendgoodsaddr) {
        this.sendgoodsaddr = sendgoodsaddr == null ? null : sendgoodsaddr.trim();
    }

    public String getReceivegoodsaddr() {
        return receivegoodsaddr;
    }

    public void setReceivegoodsaddr(String receivegoodsaddr) {
        this.receivegoodsaddr = receivegoodsaddr == null ? null : receivegoodsaddr.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getReceivecustomer() {
        return receivecustomer;
    }

    public void setReceivecustomer(String receivecustomer) {
        this.receivecustomer = receivecustomer == null ? null : receivecustomer.trim();
    }

    public Double getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(Double totalfee) {
        this.totalfee = totalfee;
    }

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}