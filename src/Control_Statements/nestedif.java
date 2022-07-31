package Control_Statements;

public class nestedif {
	public static void main(String[] args) {
		int amount = 3000;
		
		if (amount >= 500) {
			System.out.println("free delivery");
			
			if (amount >=1000) {
			System.out.println("5% discount applied");
			}
			else {
			System.out.println("no discount");
			}
	   }
		else {
		System.out.println("delivery charges are 30");
	}
	
}
}