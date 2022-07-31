package mainandregular;

public class zeroparameter3 {
	
	//6. example of method with parameter
	
		//int , int parameter method
		public static void addition(int a, int b) // a=100 , b=200
		{
			int sum =a+b;             //300
			System.out.println(sum);
		}
		
		
		
		//int , int parameter method
		public void sub(int num1, int num2)  //7,1
		{
			int substarction=num1-num2;             //7-1=6
			System.out.println(substarction);
		}
		
		public static void main(String[] args) 
		{
			addition(10,20);        //30
			addition(5, 15);         //  20
			
			System.out.println("----------------------------------");
			
			zeroparameter3 s9=new zeroparameter3();
			s9.sub(7, 1);
			
			
		}

}
