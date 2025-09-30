package inheritence;

public class SingleC extends SingleP {
	public void draw()
	{
		System.out.println("child draw");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleC obj=new SingleC ();
		obj.sing();
		obj.draw();
	}

}
