package logical;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args)
	{
		//pune...>enup
       
	   // Take input from user
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter any string");
//		String orgStr=sc.next();
//		String revStr="";
//		{
//			for(int i=orgStr.length()-1; i>=0; i--)
//			{
//				char t = orgStr.charAt(i);
//				revStr = revStr+t;	
//			}
//			System.out.println("original string is " +orgStr);
//			System.out.println("Reverse string is" +revStr);
//		}
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String orgStr = sc.next();
		String revStr="";
		 for(int i=orgStr.length()-1;i>=0;i--)
		 {
			char k = orgStr.charAt(i);
			revStr=revStr+k;
		 }
		 System.out.println("Enter orginal string" +orgStr);
		 System.out.println("Reverse string is" +revStr);
		 }
		
	
	}

