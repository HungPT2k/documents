package com.example.springboot.models;

public class ResponseObject3 {
    private String status;
    private String message;
    private Object data; // kiểu dữ liệu nói chung, chứa dc nhiều loại: data, user, message..
    private int roles;
    public ResponseObject3(){

    }

    public ResponseObject3(String status, String message, Object data, int roles) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.roles = roles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getRoles() {
        return roles;
    }

    public void setRoles(int roles) {
        this.roles = roles;
    }
}
