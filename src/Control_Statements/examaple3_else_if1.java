package Control_Statements;

public class examaple3_else_if1 {
	public static void main(String[] args)
	{
		
		int marks=88;
		
		
		if(marks>=65)           //condition1
		{
			System.out.println("Distinction");
		}
		
		else if(marks>=60 & marks<=64)              //condition2
		{
			System.out.println("1st class");
		}
		
		else if (marks>=50 & marks<=59)            //condition 3
		{
			System.out.println("2nd class ");
		}
		
		else if (marks>=35 & marks<=49)
		{
			System.out.println("Pass");
		}
		else if (marks<35) 
		{
			System.out.println("Fail");
		} 
				
	}
	

}
