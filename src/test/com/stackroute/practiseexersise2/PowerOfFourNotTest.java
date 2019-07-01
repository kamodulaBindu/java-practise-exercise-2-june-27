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
    public void checkWhetherPowerOfFourOrNot(){
        actualResult=obj.isPowerOfFour(64);
        expectedResult="it is power of 4";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkWhetherPowerOfFourOrNot1(){
        actualResult=obj.isPowerOfFour(6);
        expectedResult="it is not a power of 4";
        assertEquals(expectedResult,actualResult);
    }

}

