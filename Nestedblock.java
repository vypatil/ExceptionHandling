package ExceptionHandling;

public class Nestedblock {

	public static void main(String[] args) {

		m1();

	}

	public static void m1 () {

		int a =10;
		int b=0;
		int res=0;

		try {

			System.out.println("outer try block ");

			try {
				res = a/b;
				System.out.println("inner try block");
			}

			catch(ArithmeticException e) {
				System.out.println("inner catch block");

			}
		}

		catch(ArithmeticException e) {

			System.out.println("outer try block");

		}
		finally {
			System.out.println("inside finally");
		}
	}

}
