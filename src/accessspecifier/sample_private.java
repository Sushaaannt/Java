package accessspecifier;

public class sample_private 
{
	private int x;
	static int y;
	
	private sample_private() 
	{
		// TODO Auto-generated constructor stub
		x= 121;
		y=42;
		
	}
	private void m1() 
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		sample_private s1= new sample_private();
		s1.m1();
		System.out.println(y);
	}

}
