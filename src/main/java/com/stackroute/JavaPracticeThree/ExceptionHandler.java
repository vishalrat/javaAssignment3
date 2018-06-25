package com.stackroute.JavaPracticeThree;

import java.io.IOException;

public class ExceptionHandler {
    String message;
    ExceptionHandler(String message){this.message=message;}
    public String handler(String msg){
        // TODO Auto-generated method stub
        
        ExceptionHandler Exp=new ExceptionHandler(msg);
        try {
            throw new IOException("sorry device error"); 
        }
        catch(Exception e) {
            System.out.println(Exp.message);
        }
        finally {return "finally";}
    }

}