package interfaceexample;

public class InterfaceCC implements InterfacePA,InterfacePB {
	 public void draws()
	 {
		 System.out.println("parent PA draws");
	 }
	 public void sings()
	 {
		 System.out.println("parent PB sings");
	 }

	public static void main(String[] args) {
		InterfaceCC obj=new InterfaceCC();
		obj.draws();
		obj.sings();
		// TODO Auto-generated method stub

	}

}
