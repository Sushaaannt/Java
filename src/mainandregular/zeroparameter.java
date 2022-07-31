package mainandregular;

public class zeroparameter{
	
	//5. example without/zero parameter method
	
	public static void main(String[] args)
	{
		
		//static method call from same class
		m1();
		
		
		//static method call from diff class
		zeroparameter2.m2(); 
		
	
		//non-static method call from same class
		zeroparameter s7=new zeroparameter();
		s7.m3();
		
		//non-static method call from diff class
		zeroparameter2 s8=new zeroparameter2();
		s8.m4();
		
	}
	
	public static void m1()    //method without/zero parameter
	{
		System.out.println("running static regular method m1 from same class");
	}
	
	public void m3()           //method without/zero parameter
	{
		System.out.println("running non-static regular method m3 from same class");
	}
	
}


