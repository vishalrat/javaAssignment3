package com.stackroute.JavaPracticeThree;


import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionHandlerTest {


    @Test
    public void test() {
        String s="consecutive";
        ExceptionHandler e=new ExceptionHandler(s);
        
        String n="finally";
        //Arrange
     assertEquals(n,e.handler(s));
    }
}