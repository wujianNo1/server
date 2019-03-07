package com.itbaizhan.pojo;

public class DriverWithBLOBs extends Driver {
    private String drivelicence;

    private String runlicence;

    private String bizlicence;

    private String insurancecard;

    private String remark;

    public String getDrivelicence() {
        return drivelicence;
    }

    public void setDrivelicence(String drivelicence) {
        this.drivelicence = drivelicence == null ? null : drivelicence.trim();
    }

    public String getRunlicence() {
        return runlicence;
    }

    public void setRunlicence(String runlicence) {
        this.runlicence = runlicence == null ? null : runlicence.trim();
    }

    public String getBizlicence() {
        return bizlicence;
    }

    public void setBizlicence(String bizlicence) {
        this.bizlicence = bizlicence == null ? null : bizlicence.trim();
    }

    public String getInsurancecard() {
        return insurancecard;
    }

    public void setInsurancecard(String insurancecard) {
        this.insurancecard = insurancecard == null ? null : insurancecard.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}