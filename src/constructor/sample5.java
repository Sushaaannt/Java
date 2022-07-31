package constructor;

public class sample5 {
	
	//3. example of user defined with parameter constructor
	
		int num1;   //5      
		int num2;   //6
		
		//constructor with parameter(2 int parameter)(int, int parameter)
		sample5(int a, int b)  //a=5, b=6
		{
			num1=a;    // 5
			num2=b;	    //6	
		}
		
		public void addition()
		{
			System.out.println(num1+num2);  //30
		}
		
		public void multiplication()
		{
			System.out.println(num1*num2);
		}
		
		
		public static void main(String[] args)
		{
			
			sample5 s5=new sample5(10,20);
			s5.addition();            //30
			s5.multiplication();       //200
			
			System.out.println("---");
			
			sample5 s6=new sample5(5, 6);
			s6.addition();     //11
			s6.multiplication();  //30
			
			System.out.println("---------------------------------");
			
			sample6 s7=new sample6(25,15);
			s7.substraction();      //10
			
			
			sample6 s8=new sample6(4, 3);
			s8.substraction();
			
		}

}
