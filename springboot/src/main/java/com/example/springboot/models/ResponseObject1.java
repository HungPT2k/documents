package com.example.springboot.models;

import lombok.Data;

@Data
public class ResponseObject1 {
    private String status;
    private String message;
    private int save;
    public ResponseObject1(){

    }

    public ResponseObject1(String status, String message, int save) {
        this.status = status;
        this.message = message;
        this.save = save;
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

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }
}
