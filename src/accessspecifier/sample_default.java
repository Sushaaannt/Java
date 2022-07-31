package accessspecifier;

public class sample_default //default access specifier
{
	int a;
	int b;
	
	sample_default() //multiple constructor
	{
		a=15;
		b=24;
	}
	sample_default(int num1, int num2)
	{
		a= num1;
		b= num2;
		
	}
	 void m1() 
	 {
		 System.out.println(a+b); //39
	 }
	 
	 void m2() {
		 System.out.println(b-a);
	 }
	 public static void main(String[] args) {
		 
		 sample_default s2= new sample_default();
		 s2.m1();
		 
		 sample_default s3= new sample_default(5,20);
		 System.out.println(s3.a*s3.b); //100
	}

}
