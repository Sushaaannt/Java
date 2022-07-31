package collection;

import java.util.ArrayList;


public class generic {
	public static void main(String[] args)
	{		
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("abc");
	    al.add("xyz");
	    al.add(100);
	    al.add(65.5f);		
		
		for(Object x :al) 
		{
			System.out.println(x);
		}
		
		
		
	}


}
