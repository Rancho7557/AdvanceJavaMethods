package jADVJ2EE;

import java.io.File;
import java.io.IOException;

//import java.io.*;

public class CreateFile {
  
	public static void main(String[] args) throws IOException {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
       File f = new File("C:\\Users\\Tusha\\Desktop\\JavaProgram.html");
      // try {
           if(f.createNewFile())
           {
    	       System.out.println("File CREATE SUCCSESSFULLY ON LOCATION.....!");
           }
            else
           {
    	       System.out.println("This file already Exist......");
           }
       }
      /* catch(IOException i)
       {
    	 System.out.println("Exception Handled....!");  
       }*/
	}


