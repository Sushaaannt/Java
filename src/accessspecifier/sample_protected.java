package accessspecifier;

public class sample_protected {
	
	protected int a;
	protected int b;
	
	
	protected sample_protected() {
		
		a=56;
		b=7;
	}
	
	protected void m1() {
		int c=14;
		System.out.println(a/b); 
		System.out.println(c/b);
	}
	
	public static void main(String[] args) {
		sample_protected s1 = new sample_protected();
		s1.m1();
		System.out.println(s1.a*s1.b);
		
	}

}
