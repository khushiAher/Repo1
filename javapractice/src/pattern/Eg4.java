package pattern;

public class Eg4 {

	public static void main(String[] args) 
	{
	  // *****
	  //  ****
	   //  ***
	    //  **
         //	 *
		
		// row...> 5 column...>5
		
		int space=0;
		int star=5;
		
		// outer loop...> row
		
		for(int row=1; row<=5; row++)
		{
			// inner loop...>column
			
			for(int column=1; column<=star; column++)
			{
				System.out.print("*");
			}
			 System.out.println();
			 star--;
			 space++;
			
		}
		
		System.out.println("/////////////////////////");
		
    
	
		


		
		
		


		
		
	} 
	

}
