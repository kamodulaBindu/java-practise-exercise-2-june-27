package com.stackroute.practiseexersise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class WordFrequencyTest {
    WordFrequency wordFrequency;

    @Before
    public void setup(){
        wordFrequency=new WordFrequency();
    }
    @Test
    public void readFileAndConveretToUpperCase() throws IOException {
        String str=wordFrequency.readFrequencyOfWordsInFile(new File("file1.txt"));
        assertEquals(" i-2,am-2,man-1,good-1",str);
    }
    @After
    public void tearDown(){
        wordFrequency = null;
    }
}