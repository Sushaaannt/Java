package Control_Statements;

public class example4_nested_If {
	public static void main(String[] args)
	{
		
		
	int age =90;
	int weight =60;
	
	// 10>=18
	if(age>=18)    //outer if
	{
		System.out.println("adult");
		
		//60>=50
		if(weight>=50)     //nested or inner if
		{
			System.out.println("eligible for blood donation: weight>=50");
		}
		else 
		{
			System.out.println("Not eligible for blood donation: weight <50 ");
		}
	}
	else 
	{
		System.out.println("Not eligible for blood donation: age <18");
	}	
		
	}

}
