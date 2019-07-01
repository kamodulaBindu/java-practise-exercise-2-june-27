package com.stackroute.practiseexersise2;

import java.io.*;
//Read contents of file and print in upper case
public class ReadTextToUpperCase {
    public static String readFile(File file) throws IOException {
        String line=" ";
        String str=" ";
        int len=0;
        try{
            FileReader fr=new FileReader(file);
            BufferedReader bufferReader=new BufferedReader(fr);
            while((line=bufferReader.readLine())!=null)
            {
                str=str.concat(line);
            }
            len=str.length();
            bufferReader.close();;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str.toUpperCase();
    }
}
