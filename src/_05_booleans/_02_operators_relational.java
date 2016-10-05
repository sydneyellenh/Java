package _05_booleans;

public class _02_operators_relational {

	public static void main(String[] args) {
		/*Relational operators
		 * >
		 * <
		 * >=
		 * <=
		 * ==
		 */
		
		//TODO Create an int called currBalance and assign it a value
		//use and if statement to check if that balence is greater than zero
		
		int currBalence = 10000;
		if (currBalence >= 10000){
			System.out.println("Werk it kween!");
		} else {
			System.out.println("You need to werk more!");	
		} 
		
		//TODO create a password string and check it
		String password = "LETMEIN";


		if(password.equals("LETMEIN")) {
			System.out.println("Log-in complete");
		}

	
	}



	
}
