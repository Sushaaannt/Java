package Control_Statements;

public class example4_nested_If1 {
public static void main(String[] args) {
				
		
		int amount =3000;
		 //3000>=500
		if(amount>=500) 
		{
			System.out.println("No delivery charges ");
			
			//  3000 >=2000
			if(amount>=2000)
			{
				System.out.println("additional 10% discount");
			}
			else 
			{
				System.out.println("No discount");
			}
				
		}
		else
		{
			System.out.println("delivery charges : 50");
		}
		
	}

}
