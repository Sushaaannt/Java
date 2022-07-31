package collection;

import java.util.TreeSet;

public class generic01 {
	public static void main(String[] args)
	{
		
		TreeSet<Integer> tr=new TreeSet<Integer>();
		
		tr.add(100);
		tr.add(600);
		tr.add(200);
		tr.add(400);
		tr.add(200);
		
		System.out.println(tr.size());
		for(Integer s1:tr)
		{
			System.out.println(s1);
		}
		
	}


}
