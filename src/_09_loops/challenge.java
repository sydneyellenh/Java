package _09_loops;

public class challenge {

	public static void main(String[] args) {

//		GOLD:
//            Create a string containing the phrase "sally sells seashells", and using a loop(Will learn later
//            so you might have to come back) count how many times the letter 's' appears in the phrase.
//     
		
		String sally = "Sally Sells Seashells";
	
		int numS = 0;
	System.out.println(sally.length());
		System.out.println(sally.charAt(31));
		for (int i = 0; i < sally.length(); i++) {
			System.out.println(sally.charAt(i));
			if (sally.charAt(i) != 'S') {
				continue;
			} else {
				numS++;
			}
			System.out.println("There are " + numS + " s characters in your string");
		
		
		
	}
	}
}