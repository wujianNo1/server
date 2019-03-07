package com.itbaizhan.pojo;

import java.util.Date;

public class Driver {
    private Integer id;

    private String drivername;

    private String idcard;

    private String phone;

    private String mobile;

    private String gender;

    private Date birthday;

    private String state;

    private String carno;

    private Integer allowcarryvolume;

    private Integer allowcarryweight;

    private String address;

    private String cartype;

    private Integer carlength;

    private String cardept;

    private String cardepttel;

    private Integer carwidth;

    private Integer goodsheight;

    private String carframeno;

    private String engineno;

    private Boolean companycar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    public Integer getAllowcarryvolume() {
        return allowcarryvolume;
    }

    public void setAllowcarryvolume(Integer allowcarryvolume) {
        this.allowcarryvolume = allowcarryvolume;
    }

    public Integer getAllowcarryweight() {
        return allowcarryweight;
    }

    public void setAllowcarryweight(Integer allowcarryweight) {
        this.allowcarryweight = allowcarryweight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Integer getCarlength() {
        return carlength;
    }

    public void setCarlength(Integer carlength) {
        this.carlength = carlength;
    }

    public String getCardept() {
        return cardept;
    }

    public void setCardept(String cardept) {
        this.cardept = cardept == null ? null : cardept.trim();
    }

    public String getCardepttel() {
        return cardepttel;
    }

    public void setCardepttel(String cardepttel) {
        this.cardepttel = cardepttel == null ? null : cardepttel.trim();
    }

    public Integer getCarwidth() {
        return carwidth;
    }

    public void setCarwidth(Integer carwidth) {
        this.carwidth = carwidth;
    }

    public Integer getGoodsheight() {
        return goodsheight;
    }

    public void setGoodsheight(Integer goodsheight) {
        this.goodsheight = goodsheight;
    }

    public String getCarframeno() {
        return carframeno;
    }

    public void setCarframeno(String carframeno) {
        this.carframeno = carframeno == null ? null : carframeno.trim();
    }

    public String getEngineno() {
        return engineno;
    }

    public void setEngineno(String engineno) {
        this.engineno = engineno == null ? null : engineno.trim();
    }

    public Boolean getCompanycar() {
        return companycar;
    }

    public void setCompanycar(Boolean companycar) {
        this.companycar = companycar;
    }
}