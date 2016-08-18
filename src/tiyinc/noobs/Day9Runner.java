package tiyinc.noobs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jfabiano on 8/18/2016.
 */
public class Day9Runner
{
    public static void main(String[] args)
    {
        System.out.println("running");
        Day9Runner myRunner = new Day9Runner();
        myRunner.testWriteFile();
        myRunner.testReadFile();
    }

    public void testReadFile()
    {
        try {
            File testFile = new File("src/tiyinc/noobs/Day9Runner.java");//read my source code noobs.txt to read the actually written file
            Scanner fileScanner = new Scanner(testFile);
            int numLines = 0;
            int numChars = 0;
            int numInts = 0;
            while(fileScanner.hasNext())
            {
                String currentLine = fileScanner.nextLine();
                numLines++;
                System.out.println(currentLine);
                //if(intIndex = currentLine.length();)
            }
            System.out.println("you have " + numLines + " in your file.");
        }catch(Exception e)
        {
           e.printStackTrace();
        }
    }

    public void testWriteFile()
    {
        System.out.println("testWriteFile()");
        FileWriter testWriter = null;
        try{
            File testFile = new File("noobs.txt");
            testWriter = new FileWriter(testFile);
            testWriter.write("Java Rocks! Harder!!!");
            //testWriter.close();
        }catch(Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            if(testWriter != null) {
                try {
                    testWriter.close();
                }catch(IOException e)
                {
                    e.printStackTrace();
                }

                //testWriter.close();
            }
        }
    }
}
