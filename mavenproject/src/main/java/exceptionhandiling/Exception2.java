package exceptionhandiling;

public class Exception2 {
	public void checkage(int a) throws ArithmeticException{
		if (a<=18)
		{
			throw new ArithmeticException("accessed denied");
		}
		else
		{
			System.out.println("not ealigible");
		}
	}

	public static void main(String[] args) {
		Exception2 obj=new Exception2();
		obj.checkage(2);
		

		// TODO Auto-generated method stub

	}

}
