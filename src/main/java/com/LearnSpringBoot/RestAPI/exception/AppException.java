package com.LearnSpringBoot.RestAPI.exception;

public class AppException  extends  RuntimeException{
    private int code;
    private String message;

    public AppException(int code, String message) {



            this.code = code;
            this.message = message;

    }
}
