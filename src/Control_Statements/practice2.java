package Control_Statements;

public class practice2 {
	
	public static void main(String[] args) {
		int marks = 67;
		
		if (marks >=66) {
			System.out.println("first class with distinction");
		}
		else if (marks >= 60){
			System.out.println("first class");
		}
		else if (marks >= 57) {
			System.out.println("higher second class");
		}
		else if (marks>= 35 & marks < 57){
			System.out.println("pass");	
		}
		else
		{
			System.out.println("fail");
		}
	}

}
