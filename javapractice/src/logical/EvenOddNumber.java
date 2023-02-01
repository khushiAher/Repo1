package logical;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=sc.nextInt();
		
		if(no%2==0)
		{
			System.out.println("Given number is even number");
		}
		else
		{
			System.out.println("Given number is odd number");
		}
		
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int No=sc.nextInt();
		if(No%3==0)
		{
			System.out.println("Given number is odd");
		}
		else 
		{
			System.out.println("Givem number is even");
		}
				

	}

}
