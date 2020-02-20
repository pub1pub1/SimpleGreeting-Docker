package com.simple;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


/**
 * Generate a unique number
 *
 */
public class Greeting 
{

    public static void main( String[] args )
    {
        String envFile = System.getenv("FILE_NAME");
        String message = System.getenv("MESSAGE");
  
        System.out.println("FILE_NAME: " + envFile);
        System.out.println("MESSAGE: " + message);

	 try {
            Files.write(Paths.get(envFile), message.getBytes());
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("There's a problem");
            e.printStackTrace();
        }
    }
  
}
