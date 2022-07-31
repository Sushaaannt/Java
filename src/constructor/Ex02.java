package constructor;

public class Ex02 extends Ex01{
	
	int c;
	int d;
	
	Ex02(){
		c=5;
		d=7;
	
	}
	public void m2() {
		System.out.println(c*d);
	}
	
	public static void main(String[] args) {
		
		Ex01 s1 = new Ex01();
		s1.m1();
		
		Ex02 s2 =new Ex02();
		s2.m2();
		s2.m1();
	}

}
