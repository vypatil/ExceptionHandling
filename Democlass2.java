package ExceptionHandling;

public class Democlass2 {

	public static void main(String[] args) {

		int res=0;
		int denom=0;
		int[] nums = {10,20,30};

		try {
			
			res = nums[4]/denom;
		}
		
		// unreachable catch block because first index not present so second catch block executed
		catch(ArithmeticException e) {	
			
			System.out.println("ArithmeticException exception is occured ");
		}
		
		catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException exception is occured ");
		}

		System.out.println("result is " +res);

		System.out.println("main method ended ");
	}

}
