package ExceptionHandling;

// custom checked exception

class ageInvalidException extends Exception {

	ageInvalidException(String message) {

		super(message);
	}
}
public class CustomCheckedException {

	public static void main(String[] args) {

		int age =20;

		try {

			if(age<18) {

				throw new ageInvalidException("cant vote");
			}
			else {
				System.out.println("you can vote");
			}
		}
		catch(ageInvalidException e) {

			e.printStackTrace();
		}
	}

}

