package com.itbaizhan.pojo;

import java.util.Date;

public class GoodsBill {
    private Integer id;

    private String goodsbillcode;

    private String sendgoodscustomerno;

    private String sendgoodscustomer;

    private String sendgoodscustomertel;

    private String sendgoodscustomeraddr;

    private String receivegoodscustomercode;

    private String receivegoodscustomer;

    private String receivegoodscustomertel;

    private Date sendgoodsdate;

    private String sendgoodsaddr;

    private Date predeliverydate;

    private Date factdealdate;

    private Double helpacceptpayment;

    private Double acceptprocedurerate;

    private String paymode;

    private String fetchgoodsmode;

    private String writebillperson;

    private Date writedate;

    private Integer validity;

    private Boolean ifaudit;

    private Boolean ifsettleaccounts;

    private String transferstation;

    private Double transferfee;

    private Double reducefund;

    private Double paykickback;

    private Double moneyofchangepay;

    private Double carrygoodsfee;

    private Double carriage;

    private Double insurance;

    private Integer employeeid;

    private String acceptionstation;

    private String sendgoodscustomermobile;

    private String receivegoodscustomermobile;

    private String receivegoodscustomeraddr;
    private String receivegoodsaddr;

    private String remarker;
    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReceivegoodscustomeraddr() {
        return receivegoodscustomeraddr;
    }

    public void setReceivegoodscustomeraddr(String receivegoodscustomeraddr) {
        this.receivegoodscustomeraddr = receivegoodscustomeraddr;
    }

    public String getReceivegoodsaddr() {
        return receivegoodsaddr;
    }

    public void setReceivegoodsaddr(String receivegoodsaddr) {
        this.receivegoodsaddr = receivegoodsaddr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsbillcode() {
        return goodsbillcode;
    }

    public void setGoodsbillcode(String goodsbillcode) {
        this.goodsbillcode = goodsbillcode == null ? null : goodsbillcode.trim();
    }

    public String getSendgoodscustomerno() {
        return sendgoodscustomerno;
    }

    public void setSendgoodscustomerno(String sendgoodscustomerno) {
        this.sendgoodscustomerno = sendgoodscustomerno == null ? null : sendgoodscustomerno.trim();
    }

    public String getSendgoodscustomer() {
        return sendgoodscustomer;
    }

    public void setSendgoodscustomer(String sendgoodscustomer) {
        this.sendgoodscustomer = sendgoodscustomer == null ? null : sendgoodscustomer.trim();
    }

    public String getSendgoodscustomertel() {
        return sendgoodscustomertel;
    }

    public void setSendgoodscustomertel(String sendgoodscustomertel) {
        this.sendgoodscustomertel = sendgoodscustomertel == null ? null : sendgoodscustomertel.trim();
    }

    public String getSendgoodscustomeraddr() {
        return sendgoodscustomeraddr;
    }

    public void setSendgoodscustomeraddr(String sendgoodscustomeraddr) {
        this.sendgoodscustomeraddr = sendgoodscustomeraddr == null ? null : sendgoodscustomeraddr.trim();
    }

    public String getReceivegoodscustomercode() {
        return receivegoodscustomercode;
    }

    public void setReceivegoodscustomercode(String receivegoodscustomercode) {
        this.receivegoodscustomercode = receivegoodscustomercode == null ? null : receivegoodscustomercode.trim();
    }

    public String getReceivegoodscustomer() {
        return receivegoodscustomer;
    }

    public void setReceivegoodscustomer(String receivegoodscustomer) {
        this.receivegoodscustomer = receivegoodscustomer == null ? null : receivegoodscustomer.trim();
    }

    public String getReceivegoodscustomertel() {
        return receivegoodscustomertel;
    }

    public void setReceivegoodscustomertel(String receivegoodscustomertel) {
        this.receivegoodscustomertel = receivegoodscustomertel == null ? null : receivegoodscustomertel.trim();
    }

    public Date getSendgoodsdate() {
        return sendgoodsdate;
    }

    public void setSendgoodsdate(Date sendgoodsdate) {
        this.sendgoodsdate = sendgoodsdate;
    }

    public String getSendgoodsaddr() {
        return sendgoodsaddr;
    }

    public void setSendgoodsaddr(String sendgoodsaddr) {
        this.sendgoodsaddr = sendgoodsaddr == null ? null : sendgoodsaddr.trim();
    }

    public Date getPredeliverydate() {
        return predeliverydate;
    }

    public void setPredeliverydate(Date predeliverydate) {
        this.predeliverydate = predeliverydate;
    }

    public Date getFactdealdate() {
        return factdealdate;
    }

    public void setFactdealdate(Date factdealdate) {
        this.factdealdate = factdealdate;
    }

    public Double getHelpacceptpayment() {
        return helpacceptpayment;
    }

    public void setHelpacceptpayment(Double helpacceptpayment) {
        this.helpacceptpayment = helpacceptpayment;
    }

    public Double getAcceptprocedurerate() {
        return acceptprocedurerate;
    }

    public void setAcceptprocedurerate(Double acceptprocedurerate) {
        this.acceptprocedurerate = acceptprocedurerate;
    }

    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode == null ? null : paymode.trim();
    }

    public String getFetchgoodsmode() {
        return fetchgoodsmode;
    }

    public void setFetchgoodsmode(String fetchgoodsmode) {
        this.fetchgoodsmode = fetchgoodsmode == null ? null : fetchgoodsmode.trim();
    }

    public String getWritebillperson() {
        return writebillperson;
    }

    public void setWritebillperson(String writebillperson) {
        this.writebillperson = writebillperson == null ? null : writebillperson.trim();
    }

    public Date getWritedate() {
        return writedate;
    }

    public void setWritedate(Date writedate) {
        this.writedate = writedate;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    public Boolean getIfaudit() {
        return ifaudit;
    }

    public void setIfaudit(Boolean ifaudit) {
        this.ifaudit = ifaudit;
    }

    public Boolean getIfsettleaccounts() {
        return ifsettleaccounts;
    }

    public void setIfsettleaccounts(Boolean ifsettleaccounts) {
        this.ifsettleaccounts = ifsettleaccounts;
    }

    public String getTransferstation() {
        return transferstation;
    }

    public void setTransferstation(String transferstation) {
        this.transferstation = transferstation == null ? null : transferstation.trim();
    }

    public Double getTransferfee() {
        return transferfee;
    }

    public void setTransferfee(Double transferfee) {
        this.transferfee = transferfee;
    }

    public Double getReducefund() {
        return reducefund;
    }

    public void setReducefund(Double reducefund) {
        this.reducefund = reducefund;
    }

    public Double getPaykickback() {
        return paykickback;
    }

    public void setPaykickback(Double paykickback) {
        this.paykickback = paykickback;
    }

    public Double getMoneyofchangepay() {
        return moneyofchangepay;
    }

    public void setMoneyofchangepay(Double moneyofchangepay) {
        this.moneyofchangepay = moneyofchangepay;
    }

    public Double getCarrygoodsfee() {
        return carrygoodsfee;
    }

    public void setCarrygoodsfee(Double carrygoodsfee) {
        this.carrygoodsfee = carrygoodsfee;
    }

    public Double getCarriage() {
        return carriage;
    }

    public void setCarriage(Double carriage) {
        this.carriage = carriage;
    }

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getAcceptionstation() {
        return acceptionstation;
    }

    public void setAcceptionstation(String acceptionstation) {
        this.acceptionstation = acceptionstation == null ? null : acceptionstation.trim();
    }

    public String getSendgoodscustomermobile() {
        return sendgoodscustomermobile;
    }

    public void setSendgoodscustomermobile(String sendgoodscustomermobile) {
        this.sendgoodscustomermobile = sendgoodscustomermobile == null ? null : sendgoodscustomermobile.trim();
    }

    public String getReceivegoodscustomermobile() {
        return receivegoodscustomermobile;
    }

    public void setReceivegoodscustomermobile(String receivegoodscustomermobile) {
        this.receivegoodscustomermobile = receivegoodscustomermobile == null ? null : receivegoodscustomermobile.trim();
    }

    public String getRemarker() {
        return remarker;
    }

    public void setRemarker(String remarker) {
        this.remarker = remarker == null ? null : remarker.trim();
    }
}