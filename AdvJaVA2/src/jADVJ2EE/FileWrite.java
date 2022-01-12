package jADVJ2EE;
import java.io.FileWriter;
import java.io.IOException;


//when we want to write something in file we will got some expection so we need to handle this exceptions in java.
public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		try
		{
			FileWriter d = new FileWriter("C:\\Users\\Tusha\\Desktop\\JavaWrite.txt");
			try
			{
				d.write("<a>Java programming using write this text in java...!</a> ");
			}
			finally
			{
				d.close();
			}
			System.out.println("Succesfully Write your html content using java..!");
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}
	
}

/* fileReader code....!
 package jADVJ2EE;
import java.io.*;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileReader vm = new FileReader("C:\\Users\\Tusha\\Desktop\\JavaWrite.txt");
            try
            {
            	int i;
            	while((i = vm.read())!=-1)
            	{
            		System.out.println((char)i);
            	}
            }
            finally
            {
            	vm.close();
            	System.out.println("file closed");
            }
        }
        catch(IOException e)
        {
        	System.out.println("Exception handled..!");
        }
	}

}
*/
