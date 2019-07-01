package com.stackroute.practiseexersise2;

import java.io.*;
//Read contents of file and print in upper case
public class ReadTextToUpperCase {
    public static String readFile(File file) throws IOException {
        String line=" ";
        String rev=" ";
        int len=0;
        try{
            FileReader fr=new FileReader(file);
            BufferedReader bufferReader=new BufferedReader(fr);
            while((line=bufferReader.readLine())!=null)
            {
                rev=rev.concat(line);
            }
            len=rev.length();
            bufferReader.close();;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return rev.toUpperCase();
    }
}
