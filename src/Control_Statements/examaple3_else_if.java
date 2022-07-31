package Control_Statements;

public class examaple3_else_if {
	public static void main(String[] args)
	{
		
		int marks=33;
		
		//33>=65
		if(marks>=65)           //condition1
		{
			System.out.println("Distinction");
		}
		//    33 >= 60
		else if(marks>=60)              //condition2
		{
			System.out.println("1st class");
		}
		//     33 >=50
		else if (marks>=50)            //condition 3
		{
			System.out.println("2nd class ");
		}
		//33 >=35
		else if (marks>=35)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
				
	}
	
}
