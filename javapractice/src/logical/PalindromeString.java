package logical;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{

     Scanner sc=new Scanner(System.in);
     System.out.println("please enter any string");
     String orgStr=sc.next();
     String revStr="";
      for(int i=orgStr.length()-1; i>=0; i--)
      {
    	   char a = orgStr.charAt(i);
    	   revStr=revStr+a;
      }
      System.out.println("Original string is " +orgStr);
      System.out.println("Reverse string is " +revStr);
      
      if(revStr.equals(orgStr))
      {
    	  System.out.println("String is palindrom");
      }
      else
      {
    	  System.out.println("String is not palindrom");
      }
     
     
    
      
      
	}

}
