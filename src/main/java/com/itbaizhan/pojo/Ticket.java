package com.itbaizhan.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Ticket {
    private Integer id;
    private DriverWithBLOBs driverWithBLOBs;


    private String billtype;

    private String billcode;

    private String billstate;

    //格式化JSON日期
    //    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date writedate;

    private String acceptstation;

    public DriverWithBLOBs getDriverWithBLOBs() {
        return driverWithBLOBs;
    }

    public void setDriverWithBLOBs(DriverWithBLOBs driverWithBLOBs) {
        this.driverWithBLOBs = driverWithBLOBs;
    }

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

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    public String getBillstate() {
        return billstate;
    }

    public void setBillstate(String billstate) {
        this.billstate = billstate == null ? null : billstate.trim();
    }

    public Date getWritedate() {
        return writedate;
    }

    public void setWritedate(Date writedate) {
        this.writedate = writedate;
    }

    public String getAcceptstation() {
        return acceptstation;
    }

    public void setAcceptstation(String acceptstation) {
        this.acceptstation = acceptstation == null ? null : acceptstation.trim();
    }
}