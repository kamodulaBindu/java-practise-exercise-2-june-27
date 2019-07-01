package com.stackroute.practiseexersise2;


import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.Assert.*;

public class ReadTextFileTest {
    ReadTextFile file2;
    PrintWriter actualResult;
    String expectedResult;
    @Before
    public void setup(){
        file2=new ReadTextFile();
    }
    @Test
    public void readFileAndConveretToUpperCase() throws IOException {
        String str=file2.readFile(new File("file2.txt"));
        assertEquals(" HELLOWELCOME",str);
    }

}