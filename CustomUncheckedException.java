package ExceptionHandling;

// custom unchecked/Runtime exception 

class noVoteException extends RuntimeException {

	noVoteException(String message) {

		super(message);
	}
}

public class CustomUncheckedException {

	public static void main(String[] args) {

		int age = 20;

		if (age < 18) {

			throw new noVoteException("cant vote ");
		} else {

			System.out.println("you can vote");
		}
	}
}
