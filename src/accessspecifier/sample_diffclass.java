package accessspecifier;

public class sample_diffclass extends sample_default { //calling from diff class
	
	public static void main(String[] args) {
		 
		sample_default s3= new sample_default();
		s3.m1();//39
		s3.m2();
		System.out.println(s3.a*s3.b);//360
	}
	

}
