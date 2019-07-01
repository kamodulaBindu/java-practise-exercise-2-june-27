package com.stackroute.practiseexersise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePalindromeTest {
    ReversePalindrome reversePalindrome;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        reversePalindrome = new ReversePalindrome();
    }

    @Test
    public void checkIfReverseStringIsPalindrome()
    {
        actualresult=reversePalindrome.reversePalindrome("hd7kehd09wn");
        expectedresult = "String is not a palindrome";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkIfReverseStringIsPalindromeOrNot()
    {
        actualresult= reversePalindrome.reversePalindrome("chdgy070ygdhc");
        expectedresult="String is a palindrome";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void checkReverseStringIsPalindromeOrNot()
    {
        actualresult= reversePalindrome.reversePalindrome("*(&^%$^&*(&*(*");
        expectedresult="String is not a palindrome";
        assertEquals(expectedresult,actualresult);
    }
    @After
    public void tearDown(){
        reversePalindrome = null;
    }

}