package logical;

public class ReverseNumber
{

	public static void main(String[] args) 
	{
		//int 1=1234;
		// number...>string
		//string...>number
		
   int orgNo=1234;
   String OrgStr =Integer.toString(orgNo);
   String revStr="";
   
   for(int i=OrgStr.length()-1; i>=0; i--)
   {
	   char t = OrgStr.charAt(i);
	   revStr=revStr+t;
   }
   
  // System.out.println(revStr);
   
   int revno=Integer.parseInt(revStr);
   
   System.out.println("Original number is" +orgNo);
   System.out.println("Reverse number is" +revno);

	}

}
