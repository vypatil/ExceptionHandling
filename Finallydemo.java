package ExceptionHandling;

public class Finallydemo {

	public static void main(String[] args) {

		System.out.println("main method started");
		m1();
		System.out.println("main method ended ");

	}


	public static void m1 () {

		System.out.println("m1 method started!!");

		try {
			System.out.println("inside try 1");
			int res = 10/0;
			System.out.println(res);
		}
		catch(ArithmeticException e) {

			System.out.println("dont divide with zero ");
		}
		finally {
			System.out.println("inside finally 1");

		}

		System.out.println("m1 method ended");

	}

}
