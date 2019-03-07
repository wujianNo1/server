package com.itbaizhan.pojo;

public class RespBean {
    private String msg;
    private Object obj;
    private Integer status;

    public static RespBean build() {
        return new RespBean();
    }

    public static RespBean ok(String msg, Object obj) {
        return new RespBean(msg, obj, 200);
    }

    public static RespBean ok(String msg) {
        return new RespBean(msg, null, 200);
    }

    public static RespBean error(String msg, Object obj) {
        return new RespBean(msg, obj, 500);
    }

    public static RespBean error(String msg) {
        return new RespBean(msg, null, 500);
    }

    private RespBean() {
    }

    private RespBean(String msg, Object obj, Integer status) {
        this.msg = msg;
        this.obj = obj;
        this.status = status;
    }

    public Object getObj() {

        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {

        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
