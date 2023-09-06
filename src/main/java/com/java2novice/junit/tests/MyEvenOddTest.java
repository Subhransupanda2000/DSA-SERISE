package com.java2novice.junit.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyEvenOddTest {

    @Test
    public void testEvenOddNumber(){
        MyEvenOdd meo = new MyEvenOdd();
        assertEquals("10 is a even number", true, meo.isEvenNumber(10));
    }
}