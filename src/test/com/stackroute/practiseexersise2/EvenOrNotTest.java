package com.stackroute.practiseexersise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrNotTest {
    EvenOrNot even;
    @Before
    public void setUp()
    {
        even=new EvenOrNot();
    }
    @Test
    public void checkWhetherTheIntegerIsNotEven(){
        Boolean b=even.isEven(3);
        assertEquals(false,b);
    }
    @Test
    public void checkWhetherTheIntegerIsEven(){
        Boolean b=even.isEven(4);
        assertEquals(true,b);
    }
    @After
    public void tearDown(){
        even=null;
    }

}