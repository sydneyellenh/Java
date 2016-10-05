package _06_inputoutput;

import java.util.Scanner;

public class _01_getting_user_input {

	public static void main(String[] args) {
		
		String name;
		String birthCity;
		String age;
//
//		//Scanner is a Java class - used for User Input (UI)
		Scanner inputInfo = new Scanner(System.in);
//		
//		//Setup a simple user input
		System.out.println("Enter your name below");
		name = inputInfo.nextLine();
		
		
		System.out.println("Enter your birth city below");
		birthCity = inputInfo.nextLine();
		
//		
		System.out.println("Enter your age below: ");
		age = inputInfo.nextLine();
		
		
//		Create a sentence using Scanner
		
//	
		
		System.out.println("Hello " + name + ". You were born in " + birthCity + " and you are " + age + " years old.");
		
		//You ALWAYS want to close your scanner
		inputInfo.close();
		
		
	}

}
