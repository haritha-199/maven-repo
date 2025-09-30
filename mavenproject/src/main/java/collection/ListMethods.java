package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> colour = new ArrayList<String>();//List<String> colour = new LinkedList<String>();
		
		//1-add()
		colour.add("red");
		colour.add("black");
		colour.add("white");
		colour.add("yellow");
		colour.add("yellow");
		colour.add("green");
		System.out.println(colour);
		
		//2-get()
		System.out.println("element at index 1 "+colour.get(1));
		
		//3-set()
		colour.set(2, "pink");
		System.out.println(colour);
		
		//4-indexOf()
		System.out.println("first index of yellow "+colour.indexOf("yellow"));
	
		//5-lastIndexOf?()
		System.out.println("last index of yellow "  + colour.lastIndexOf("yellow"));
		
		//6-remove()
		colour.remove(4);
		System.out.println(colour);
		
		//7-contains
		System.out.println(colour.contains("black"));
		System.out.println(colour.contains("blue"));
		
		//8-isEmpty()
		List<String> colour1 = new ArrayList<String>();
		System.out.println(colour1.isEmpty());
		System.out.println(colour.isEmpty());
		
		//8-size()
		System.out.println(colour.size());
		
		
		
		
		

	}

}
