package logical;

import java.util.Scanner;

public class CountNumberOfBlankSpaces {

	public static void main(String[] args) 
	{
		//P U N E...>3
		
//		String s="PUNE   ";
//		int count=0;
//		
//		for(int i=0; i<=s.length()-1; i++)
//		{
//			char t=s.charAt(i);
//			if(t==' ')
//			{
//				count++;	
//			}
//			System.out.println("Number of blank spaces are"+count);
		
		String s="khushi     ";
		int count=1;
		for(int i=1; i<s.length()-1;i++)
		{
			char a=s.charAt(i);
			if(a==' ')
			{
				count++;
			}
			System.out.println("No of blank spaces are" + count);
		}
			
		}
				

	}


