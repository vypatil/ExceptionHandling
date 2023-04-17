package ExceptionHandling;

public class Nested2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		m1();
		
		System.out.println("main method ended");
	}

	public static void m1() {

		try {
			int [] arr = {10,20,30,40,50};

			System.out.println(arr[5]);
			
			try {
				
				int index = arr[2]/0;
				System.out.println(index);
			}
			catch(ArithmeticException e2 ) {
					
					System.out.println("ArithmeticException");
					System.out.println("cant divide by zero");
				}
			finally {
				
				System.out.println("inner finally");
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("invalid index");
			
		}
		
		finally {
			
			System.out.println("outer finally");
		}
	}

}
