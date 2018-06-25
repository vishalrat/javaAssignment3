package com.stackroute.JavaPracticeThree;


import static org.junit.Assert.*;

import org.junit.Test;

public class ConsecutiveNumbersTest {

    @Test
    public void test() {
        ConsecutiveNumbers c=new ConsecutiveNumbers();
        String s="consecutive";
        String n="1 2 3 4";
        //Arrange
     assertEquals(s,c.checkConsecutivity(n));
    }
    @Test
    public void test1() {
        ConsecutiveNumbers c=new ConsecutiveNumbers();
        String s="non consecutive";
        String n="1 2 3 4 6";
        //Arrange
     assertEquals(s,c.checkConsecutivity(n));
    }
    @Test
    public void test2() {
        ConsecutiveNumbers c=new ConsecutiveNumbers();
        String s="invalid";
        String n="asfkljd";
        //Arrange
     assertEquals(s,c.checkConsecutivity(n));
    }
}