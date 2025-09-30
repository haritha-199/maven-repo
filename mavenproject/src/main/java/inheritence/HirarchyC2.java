package inheritence;

public class HirarchyC2 extends HirarchyP {
	public void write()
	{
		System.out.println("child2 write");
	}

	public static void main(String[] args) {
		HirarchyC2 obj=new HirarchyC2();
		obj.draw();
		obj.write();
		// TODO Auto-generated method stub

	}

}
