package logical;

import java.util.Scanner;

public class FactorailOfNumber {

	public static void main(String[] args) 
	{

       Scanner sc=new Scanner(System.in);
   
       //4!= 4*3*2*1=24
       //5! = 5*4*3*2*1 = 120
    
       System.out.println("Enter any number");
       int no=sc.nextInt();
       int fact=1;
       
       for(int i=no; i>=1; i--)
       {
    	   fact=fact*i;
       }
       System.out.println("Factorail of" +no+ " is" +fact);
    		   

	}

}
