package _09_loops;

public class _04_for_loops_practice {

	public static void main(String[] args) {

		//For loops
		
		// for (int i = 1; i <= 10; i++){
		// 	System.out.println(i);
		// }

		// for (int i = 1; i <= 10; i+=2){
		// 	System.out.println(i);
		// }

		// for (int i = 0; i <= 30; i+=3){
		// 	System.out.println(i);
		// 		if (i == 15){
		// 			System.out.println("Sweet!");
		// 		} else {
		// 			System.out.println("");
		// 		}
		// }
		
		
		
		
		
		
	//count to 100 by 7, leave out 28 and 49
	// for (int i = 0; i <= 100; i+=7){
//	 	if (i == 28 || i == 49){
//	 		continue;
//	 	}
//	 	System.out.println(i);
	// }

	// for (int i = 0; i <= 100; i += 7){
//	 	if (i != 28 && i != 49){
//	 		System.out.println(i);
//	 	}
	// }





	//count from 1 to 10.  
	//Console should read: The number is (number) 
	//If the number is five, print: "I'm alive!"
	// for (int i = 0; i <= 10; i++){
//	 	if (i != 5){
//	 		System.out.println("The number is: " + i);
//	 	} 
//	 	else
//	 	{
//	 		System.out.println("I'm alive!");
	// }
	// }


	for (int i = 1; i <= 200; i+=3){
		if(i % 35 == 0) {
			System.out.println("FizzBuzz");
		} 
		else if(i % 10 == 0)
		{
			System.out.println("Buzzbuzz");
		} 
		else if(i % 5 == 0)
		{
			System.out.println("Buzz");	
		}
		else if (i % 7 == 0){
			System.out.println("Fizz");	
			
		}
		else{
			System.out.println(i);
		}
	}



	// for (int i = 0; i <= 100; i++){
//	 	for (int i = 0; i <= 100; i+=3){
//	 		System.out.println("Fizz");
//	 	}
//	 	for (int i = 0; i <= 100; i+=5){
//	 		System.out.println("Buzz");
//	 	}
//	 	for (int i = 0; i <= 100; i+=15){
//	 		System.out.println("FizzBuzz");
//	 	}
	// }

		
	}

}
