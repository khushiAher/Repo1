package logical;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
	
//		int a=2;
//		int b=4;
//	    int mul=a*b;
//	    System.out.println(mul);
		
		// Scanner...>java...>util
		
		Scanner sc = new Scanner(System.in);
		// num
		System.out.println("Enter 1st no");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition is "+c);
		
		// char
		
		System.out.println("Enter your Name");
		String name=sc.next();
		System.out.println("My name is " +name);
		System.out.println("ThankYou...!");
	
		
		
	}

}
