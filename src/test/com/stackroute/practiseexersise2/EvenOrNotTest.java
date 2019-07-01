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
    public void checkWhetherTheGivenIntegerIsEven(){
        Boolean b=even.EvenOrNot(3);
        assertEquals(false,b);
    }
    @Test
    public void checkWhetherTheGivenIntegerIsOdd(){
        Boolean b=even.EvenOrNot(4);
        assertEquals(true,b);
    }
    @Test
    public void checkWhetherTheGivenIntegerOdd(){
        Boolean b=even.EvenOrNot(-7);
        assertEquals(false,b);
    }
    @After
    public void tearDown(){
        even=null;
    }

}