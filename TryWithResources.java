package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
		
										// normal try catch and finally block
			
		/*		BufferedReader br = null;
										
		try {

			br=new BufferedReader(new FileReader("input.txt"));
		}
		catch(IOException e) {

			e.getMessage();
		}
		finally {

			if(br != null) {

				br.close();
			}
		}*/
										// using try with resources.

		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) 
		{

		}
		catch(IOException e) {

			e.getMessage();
		}
	}



}
