package _07_conditionals;

public class _05_switch {

	public static void main(String[] args) {
		
		int whiteCastlesEaten =  7;
		String response;
		
		switch(whiteCastlesEaten){
			case 0:
				response = "That's probably smart!";
				break;
			case 5:
				response = "Are you feeling okay?";
				break;
			case 10:
				response = "Are you mad?!?!?!";
				break;
			case 20: 
				response = "And you're not dead?";
				break;
			default:
				response = "White Castle is the best!";
		}
		
		System.out.println(response);

	}

}
