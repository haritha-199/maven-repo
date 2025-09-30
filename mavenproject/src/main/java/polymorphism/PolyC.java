package polymorphism;

public class PolyC extends polyP{
	public void start(int a)
	{
		System.out.println("car starts");
		System.out.println("child "+ a);
		super.start(12);
	}

	public static void main(String[] args) {
		PolyC obj=new PolyC();
		obj.start(11);
		
		// TODO Auto-generated method stub

	}

}
