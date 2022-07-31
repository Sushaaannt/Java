package accessspecifier;

import accessspecifier.sample_protected;



public class sample_protected01 extends sample_protected

{
	 static int x=15;
	
	public static void main(String[] args) {
		
		sample_protected01 s1= new sample_protected01();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s1.a*s1.b);
		
		System.out.println(x);
		
		
	}

}
