package constructor;

public class sample8 {
	
	int a;
	int b;
	String x;
	
	
	sample8(){
		a=11;
		b=13;	
	}
	sample8(int num1,int num2){
		a=num1;
		b=num2;	
	}
	sample8(String y){
		x=y;
	}
	public void m1() {
		System.out.println(a*b);
	}
	public void m2() {
		System.out.println(b/a);
	}
	public void m3() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		sample8 s1= new sample8();
		s1.m1();
		
		sample8 s2= new sample8(2,8);
		s2.m2();
		
		sample8 s3= new sample8("Sushant");
		s3.m3();
	}

}
