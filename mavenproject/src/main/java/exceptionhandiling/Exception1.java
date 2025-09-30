package exceptionhandiling;

public class Exception1 {


	public static void main(String[] args) {
		try
		{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);// TODO Auto-generated method stub
		}
		catch(ArithmeticException e)
		{
			System.out.println("error occured");
			
		}
		finally
		{
			System.out.println("hai");
		}
	}

}
