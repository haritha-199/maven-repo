package abstractkeyword;

public class AbstractC extends AbstractP{
	public void name()
	{
		System.out.println("ann");
	}

	public static void main(String[] args) {
		//AbstractC obj=new AbstractC();
		AbstractP obj=new AbstractC();
		obj.age(12);
		obj.name();
		// TODO Auto-generated method stub

	}

}
