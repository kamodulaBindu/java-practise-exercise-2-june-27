package com.stackroute.practiseexersise2;

import com.stackroute.practiseexersise2.PowerOfFourNot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourNotTest {
    PowerOfFourNot obj;
    String expectedResult;
    String actualResult;
    @Before
    public void setUp(){
        obj=new PowerOfFourNot();
    }
    @Test
    public void givenNumberPowerOfFourOrNot(){
        actualResult=obj.isPowerOfFourOrNot(64);
        expectedResult="it is power of 4";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenIntegerPowerOfFourOrNot1(){
        actualResult=obj.isPowerOfFourOrNot(6);
        expectedResult="it is not a power of 4";
        assertEquals(expectedResult,actualResult);
    }

}

