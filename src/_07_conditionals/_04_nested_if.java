package _07_conditionals;

public class _04_nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 29;
		 
		if (age < 13)
		{
		  System.out.println("You are but a wee child!");
		}// end if for age < 13
		else if (age < 19)
		{
		  System.out.println("You are no longer a child, but a budding teenager.");
		} // end else if for age < 19
		else
		{
		  if (age < 65)
		  {
		    System.out.println("You are an adult!");
		  }// end if for age < 65
		  else
		  {
		    System.out.println("You are now a senior, enjoy the good life friends!");
		  } // end if for nested else
		  System.out.println("Also, since you are over the age of 19, you deserve a drink!");
		}// end of final else
		
	}

}
