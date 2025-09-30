package superkeyword;

public class SupervariableC extends SupervariableP{
	String colour="white";
	public void print()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}
	

	public static void main(String[] args) {
		SupervariableC obj=new SupervariableC();
		obj.print();
		// TODO Auto-generated method stub

	}

}
