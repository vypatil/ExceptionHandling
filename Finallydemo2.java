package ExceptionHandling;

public class Finallydemo2 {

	public static void main(String[] args) {

		System.out.println("main method started");
		int res =m1();
		System.out.println(res);
		System.out.println("main method ended");
	}

	public static int m1 () {

		System.out.println("inside m1 ");

		try {

			System.out.println("inside try 1");
			int res = 10/0;
			System.out.println("inside try 2");
			System.out.println("inside try 3");
			return 10;
		}

		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			return 20;
		}

		finally {

			System.out.println("inside finally");
			return 30;
		}
		
	}
}
