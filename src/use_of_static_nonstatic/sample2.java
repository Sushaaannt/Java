package use_of_static_nonstatic;

public class sample2 {
	public static void main(String[] args) {
		
		sample1 s1= new sample1();
		s1.employname = "Sharad";
		s1.employid = 12345;
		s1.employCEO = "xyz";  //objectname.variable-->non static
		
		sample1.Mobileno=45632255;
		
		sample1 s2= new sample1();
		s2.employname = "sushant";
		s2.employid = 12345;
		s2.employCEO = "vgh";  //objectname.variable-->non static
		
		sample1.Mobileno=8862255;
		
		
		sample1 s3= new sample1();
		s3.employname = "Sachin";
		s3.employid = 12345;
		s3.employCEO = "cgc";  //objectname.variable-->non static
		
		sample1.Mobileno=6332255;
		
		
		s1.showinfo();
		s2.showinfo();
		s3.showinfo();
		
		//o/p madhe mobile no same yeil coz static variable  ahe
		
	}

}