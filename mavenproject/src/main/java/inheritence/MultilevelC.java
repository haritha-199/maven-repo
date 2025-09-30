package inheritence;

public class MultilevelC extends MultilevelP {
	public void write()
	
	{
System.out.println("child write");
	}

	public static void main(String[] args) {
		MultilevelC obj=new MultilevelC();
		obj.draw();
		obj.sing();
		obj.write();
		// TODO Auto-generated method stub

	}

}
