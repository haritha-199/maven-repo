package interfaceexample;

public class InterfaceC implements InterfaceP{
	public void name()

	{
	System.out.println("ann");	
	}
public void age()
{
	System.out.println("12");
}
	public static void main(String[] args) {
		InterfaceP obj=new InterfaceC();
		obj.name();
		obj.age();
		// TODO Auto-generated method stub

	}

}
