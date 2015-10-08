package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);

      try
      {
    	 String line_data=null;
    	 String all_data="";
         BufferedReader inputStream = 
               new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream(path+"numbered.txt"));
         
         int i=0;
         while((line_data = inputStream.readLine()) != null){
        	all_data += (i+" " + line_data + "\n");
        	i++;
         }
         
         outputStream.println(all_data);
       
         System.out.println(all_data);
         inputStream.close( );
         outputStream.close( );
      }
      catch(IOException e){
      System.out.print("에러 정보:"+e);
      }
      
   }
}