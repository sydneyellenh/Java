package _09_loops;

public class _02_for {

	public static void main(String[] args) {
		
//lcv = loop controled variable
		// for (initialize lcv; relational test lcv; modify lcv)
//		for(int i = 0; i <= 10; i++) {
//		System.out.println(i);
//		}
		
		//TODO create a for loop that incriments by 5 and 
		//counts out 0-100 by five
		
//		for(int i = 0; i <= 100; i += 5) {
//			System.out.println(i);
//			}
		
		
		
		for (int i = 0; i <= 100; i+=5){
			System.out.println(i);
		}
		
//		int sum = 0;
//		for(int i = 0; i <= 10; i++) {
//			sum = sum + i;
//			
//			}
//		System.out.println(sum);
//		
//		
//		//simple interest over time
//		
//		double balence = 5000;
//		double rate = 1.02; //2% interest 
//		
//		for (int i = 0; i <= 10; i++) {
//			balence *= rate; //shorthand for balence = balence * rate
//		}
//		System.out.println(balence);
		
		
		
//		//this will help with string challlenge
//		String spaces = "There are spaces in this string.";
//				int numSpaces = 0;
//				//System.out.println(spaces.length());
//				//System.out.println(spaces.charAt(31));
//				for (int i = 0; i < spaces.length(); i++) {
//					//System.out.println(spaces.charAt(i));
//					if (spaces.charAt(i) != ' ') {
//						continue;
//					} else {
//						numSpaces++;
//					}
//					System.out.println("There are " + numSpaces + " spaces in your string");
//					
					
//					for (int a = 0; a <= 100; a -= 5){
//						System.out.println(a);
					
		
		//do loop
//		
//		int a = 10;
//		do {
//			
//					System.out.println("Hello, World!");
//					
//		} while (a < 10);
		
		
		
////How to count characters in a string	
//		String sally = ("Sally sells seashells").toLowerCase();
//		int numChar = 0;
//		for (int i = 0; i < sally.length(); i++){
//			if (sally.charAt(i) != 's'){
//				continue;
//			} else {
//				numChar++;
//			}
//		}
//		System.out.println("The number of s's in the sentence is: " + numChar);
		
		
		
//	String sentence = ("Mister Bates is not guilty!").toLowerCase();
//	int numChars = 0;
//	for (int i = 0; i < sentence.length(); i++){
//		if (sentence.charAt(i) != 'i'){
//		continue;
//	}else{
//		numChars++;
//		}
//	}
//		System.out.println("The number of i's in the sentence are: " + numChars);
		
		
		
		
		
		String downton = ("Downton Abbey is lost for good.").toLowerCase();
		int charNum = 0;
		for (int i = 0; i < downton.length(); i++){
			if (downton.charAt(i) != 'd'){
				continue;
			} else {
				charNum++;
			}
		}
		System.out.println("The number of d's is: " + charNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}

