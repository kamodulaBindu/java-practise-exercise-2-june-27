package com.stackroute.practiseexersise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchForFileExtension {
    public static void main(String[] args)
    {
        giveThelistOfFiles();
    }

    public static void giveThelistOfFiles()
    {
        File folder=new File("src/main/java/com/stackroute/practiseexersise2");
        File[] files=folder.listFiles();
        for(File file:files){
            System.out.println(file.getName());
        }
        Scanner scanner=new Scanner(System.in);
        String fileName=scanner.next();
        try
        {
            byte[] fileContent= Files.readAllBytes(Paths.get("src/main/java/com/stackroute/practiseexersise2/"+fileName));
            String content=new String(fileContent);
            System.out.println(content);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}