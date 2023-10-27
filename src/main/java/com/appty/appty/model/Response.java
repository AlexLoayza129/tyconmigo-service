package com.appty.appty.model;

import java.util.List;

public class Response {
    
    String message;
    Integer statusCode;
    List comments;
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Integer getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    public List getComments() {
        return comments;
    }
    public void setComments(List comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "{message:" + message + ", statusCode:" + statusCode + ", comments:" + comments + "}";
    }    

}
