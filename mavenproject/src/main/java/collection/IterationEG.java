package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterationEG {

	public static void main(String[] args) {
		Set<String> colour1 = new HashSet<String>();//Set<String> colour = new TreeSet<String>();
		colour1.add("red");
		colour1.add("black");
		colour1.add("white");
		System.out.println(colour1);
		
		Iterator<String>i=colour1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		i.remove();
		System.out.println(colour1);
		
		/*
		 * for(String n:colour1)
		 * {
		 * SOp(n);
		 * }

		 */
	
	}

}
