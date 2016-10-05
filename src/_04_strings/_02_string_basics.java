package _04_strings;

public class _02_string_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sydney";
		String address = "12399 Keely Drive";
		
		String toUpperCase = address.toUpperCase();
		System.out.println(toUpperCase);
		
//		Bronze Challenge
		
		String firstName = "Sydney";
		String middleName = "Ellen";
		String lastName = "Haggard";
		String fullName = firstName + " " + middleName + " " + lastName;
		
		System.out.println(fullName);
		
//		Silver Challenge
		
		String sodaCan = "Soda Can";
		String firstWord = sodaCan.substring(0, 4);
		String secondWord = sodaCan.substring(5, 8);
		System.out.println(firstWord);
		System.out.println(secondWord);
		
//		Gold Challenge
		
		String sally = "Sally Sells Seashells";
		
	}

}
