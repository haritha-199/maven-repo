package aggregation; //class A

public class Author {
	String name; //instance variable
	int pincode;

	public Author(String name,int pincode) // parameterized constructors
	{
		this.name=name;
		this.pincode=pincode;
		
		
		
	}
	public void print()
	{
		System.out.println("author name is "+name);
		System.out.println("pincode is  "+pincode);
		
	}
	

}
