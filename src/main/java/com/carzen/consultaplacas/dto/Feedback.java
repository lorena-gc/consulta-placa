package com.carzen.consultaplacas.dto;

public class Feedback {

    private String type;
    private String msg;
    private String code;
    private String property;

    public Feedback(String type, String msg, String code, String property) {
        this.type = type;
        this.msg = msg;
        this.code = code;
        this.property = property;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
