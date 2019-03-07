package com.itbaizhan.pojo;

import java.util.Date;

public class TicketDist {
    private Integer id;

    private String billtype;

    private String billstartcode;

    private String billendcode;

    private String receivebillperson;

    private Integer driverid;

    private String acceptstation;

    private Date receivebilltime;

    private String releaseperson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBilltype() {
        return billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype == null ? null : billtype.trim();
    }

    public String getBillstartcode() {
        return billstartcode;
    }

    public void setBillstartcode(String billstartcode) {
        this.billstartcode = billstartcode == null ? null : billstartcode.trim();
    }

    public String getBillendcode() {
        return billendcode;
    }

    public void setBillendcode(String billendcode) {
        this.billendcode = billendcode == null ? null : billendcode.trim();
    }

    public String getReceivebillperson() {
        return receivebillperson;
    }

    public void setReceivebillperson(String receivebillperson) {
        this.receivebillperson = receivebillperson == null ? null : receivebillperson.trim();
    }

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public String getAcceptstation() {
        return acceptstation;
    }

    public void setAcceptstation(String acceptstation) {
        this.acceptstation = acceptstation == null ? null : acceptstation.trim();
    }

    public Date getReceivebilltime() {
        return receivebilltime;
    }

    public void setReceivebilltime(Date receivebilltime) {
        this.receivebilltime = receivebilltime;
    }

    public String getReleaseperson() {
        return releaseperson;
    }

    public void setReleaseperson(String releaseperson) {
        this.releaseperson = releaseperson == null ? null : releaseperson.trim();
    }
}