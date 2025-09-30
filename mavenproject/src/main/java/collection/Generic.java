package collection;

import java.util.*;

public class Generic {

	public static void main(String[] args) {
		List<String> colour = new ArrayList<String>();//List<String> colour = new LinkedList<String>();
		
		colour.add("red");
		colour.add("black");
		colour.add("white");
		colour.add("yellow");
		colour.add("yellow");
		colour.add("green");
		System.out.println(colour);
		
		Set<String> colour1 = new HashSet<String>();//Set<String> colour = new TreeSet<String>();
		colour1.add("red");
		colour1.add("black");
		colour1.add("white");
		colour1.add("yellow");
		colour1.add("yellow");
		colour1.add("green");
		System.out.println(colour1);
	}

}
