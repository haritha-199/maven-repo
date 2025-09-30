package aggregation;

public class Book { //class B
	String name;
	int sno;
	Author author; // aggregation 
	public Book(String name,int sno,Author author)
	{
		this.name=name;
		this.sno=sno;
		this.author=author;
	}
	public void display()
	{
		System.out.println("name of book "+name);
		System.out.println("sno is "+sno);
		author.print();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author obj=new Author("ann",67345);
		Book obj1=new Book("java",12,obj);
		obj1.display();

	}

}
