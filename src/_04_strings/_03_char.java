package _04_strings;

public class _03_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		char uniChar = '\u00A5'; 
//		System.out.println(uniChar);
		
//		char[] charArray = {'a', 'b', 'c', 'd'}; //use when you want to save memory
//		System.out.println(charArray);

		
	char uniChar = '\u0040';
	System.out.println(uniChar);
		
	char [] charArray = { '\u0024', '\u0040', '\u0084'};
	System.out.println(charArray);

	System.out.println("Hello \"Tough Guy\". How are you? ");
	System.out.println("James \nPaul");
	System.out.println("c:\\desktop\\user\\textfile.txt");
	System.out.println("Sydney \t Haggard");
	System.out.println("Sydney \b Haggard");
	System.out.println("Sydney \r Haggard");
	System.out.println("Sydney \f Haggard");
	System.out.println("Sydney */ Haggard");
	
}

}