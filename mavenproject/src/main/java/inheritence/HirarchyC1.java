package inheritence;

public class HirarchyC1 extends HirarchyP {
	public void sing()
	{
		System.out.println("child sing");
	}

	public static void main(String[] args) {
		HirarchyC1 obj=new HirarchyC1();
		obj.draw();
		obj.sing();
		// TODO Auto-generated method stubV

	}

}
