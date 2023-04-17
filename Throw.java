package ExceptionHandling;

public class Throw {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		validage(10);
		
		System.out.println("main end");
	}

	
	public static void validage (int age) {
		
		if(age < 18) {
			
			throw new ArithmeticException("person not eligible");
		}
		else {
			
			System.out.println("pesrson eligible");
		}
	}
}
