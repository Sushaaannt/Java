package Primitive;

public class primitive1 {

	public static void main(String[] args) {
	//1.variable declaration(Allocating/Reserving memory)
	
	String name;//String-->Data type,name-->variable name
	String dept;//String is used for any type of data i.e multiple character
	int rollnum;//int is used for numeric and non decimal values
	float per;//float is used for numeric and decimal values
	char grade;//char is used for single character
	
	// we define to reuse the information 
	
	//2.variable initilisation or inserting value
	
	name = "Sushant"; //variable name = "variable value"
	dept = "Mechanical";
	rollnum = 100;
	per = 65.5f;  //when you define float data type always write "f" after the value
	grade = 'A';
	
	//3.variable usage
	
	System.out.println(name);
	System.out.println(dept);
	System.out.println(rollnum);
	System.out.println(per);
	System.out.println(grade);


}
}
