package _06_inputoutput;

import java.util.Scanner;

public class _02_challenges {

	public static void main(String[] args) {
	
		//Bronze challenge
		
//	String questionOne;
//	String questionTwo;
//	String questionThree;
//	
//	Scanner inputInfo = new Scanner(System.in);

//	System.out.println("Please enter your username");
//	questionOne = inputInfo.nextLine();	
//	
//	System.out.println("Please enter your password");
//	questionOne = inputInfo.nextLine();	
//	
//	System.out.println("Security Question: Where do you live?");
//	questionOne = inputInfo.nextLine();	
//	
//	System.out.println("You are logged into the system");
	

	
	//Siver challenge
	
	//
	
	String name;
	String title;
	int children;
	String queen;
	String king;
	String princess;
	String prince;
	String lady;
	String lad;
	String knight;
	String jester;
	
	Scanner inputInfo = new Scanner(System.in);
	
	//Game starts
	System.out.println("Please enter your name");
	name = inputInfo.nextLine();	
	
	System.out.println("Please enter your title: Queen, King, Princess, Prince, Knight, Lady, Lad, Jester, or peasent.");
	title = inputInfo.nextLine().toLowerCase();	
	
	if (title.contains("Queen")||title.contains("King")||title.contains("Lady")||title.contains("Lad")||title.contains("Knight")){
		System.out.println("You are royalty.");
	} else {
		System.out.println("You must work for your power.");
	}
	
	System.out.println("How many children do you have?");
	children = inputInfo.nextInt();	
	
	if (children <= 0){
		System.out.println("You have no children.");
	}
	
	if (children >= 1){
		System.out.println("You have " + children + " children.");
	}
	
	System.out.println("Your name is " + title + " " + name + " and you have " + children + " children to fight for.");
	
//	GAME INITIALIZED
	
	System.out.println("Game is initialized");
	
	String answer;
	String message;
	
	System.out.println("You see a wide open door ahead. Do you go through it? Enter yes or no:");
	
	if (answer.contains("Yes")){
		message = "You have entered through the door.  You are outside.";
	} else {
		message = "You did not walk through the door.  You are still inside.";
	};

	System.out.println(message);
	
	
	
	
	
	
	
	
	
	}

}
