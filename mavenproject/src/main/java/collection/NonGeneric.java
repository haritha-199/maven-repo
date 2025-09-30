package collection;

import java.util.*;

public class NonGeneric {

	public static void main(String[] args)
	{
		List data=new ArrayList();
		data.add("ammu");
		data.add(12);
		data.add('A');
		data.add(3.2f);
		System.out.println(data);
		 
		Set data1=new HashSet();
		data1.add("ammu");
		data1.add(12);
		data1.add('A');
		data1.add(3.2f);
		System.out.println(data1);
		// TODO Auto-generated method stub

	}

}
