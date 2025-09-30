package exceptionhandiling;

public class Exception3 {
	public void checkage(int a) throws ArithmeticException {
		if (a <= 18) {
			throw new ArithmeticException("accessed denied");
		} else {
			System.out.println("not ealigible");
		}
	}

	public static void main(String[] args) {
	
	Exception3 obj=new Exception3();
	try{
		obj.checkage(2);
	}
	catch(ArithmeticException e) {
		System.out.println("error");
	}
}
}
