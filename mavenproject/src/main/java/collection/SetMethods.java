package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<String> colour1 = new HashSet<String>();//Set<String> colour = new TreeSet<String>();
		colour1.add("red");
		colour1.add("black");
		colour1.add("white");
		System.out.println(colour1);
		
		Set<String>fruit=new HashSet<String>();
		fruit.add("apple");
		fruit.add("orange");
		fruit.add("mango");
		System.out.println(fruit);
		
		//1-addAll()
		colour1.addAll(fruit);
		System.out.println(colour1);
		System.out.println(fruit);
		
		//2-containsAll()
		System.out.println(fruit.containsAll(colour1));
		System.out.println(colour1.containsAll(fruit));
		
		//3-removeAll()
		colour1.removeAll(fruit);
		System.out.println(colour1);
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
