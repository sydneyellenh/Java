package _13_Friends;

public class Friends {

	//Properties
	
	String name;
	int age;
	String howClose;
	boolean realLifeFriend;
	int numYearsFriends;
	String school;
	String major;
	String occupation;
	boolean married;
	boolean kids;
	boolean isOnline;
	String currCity;
	String hometown;
	String gender;

	
	//Methods
	
	public void getName(){
		System.out.println("My friend's name is " + name);
	}
	
	public void getAge(){
		System.out.println("They are " + age + " years-old");
	}
	
	//TODO print specified gender so you can print gender elsewhere with nested boolean
	public void cityCheck(){
		if (currCity != hometown){
			System.out.println(name + " has moved away from home");
			} else if(currCity == hometown){
			 if(gender == "Male"){
				 System.out.println(name + " is living in his hometown");
			 } else if(gender == "Female"){
				 System.out.println(name + " is living in her hometown");
			 }
		}
	}

	public void getHowClose(){
		System.out.println("They are my " + howClose);
	}
	
	public void getRealLifeFriend(){
		if (realLifeFriend){
			System.out.println(name + " is my friend in real life!");
		} else {
			System.out.println(name + " is not my friend in real life.");
		}
	
	}
	
	public void getNumYearsFriends(){
		System.out.println("We have been friend for " + numYearsFriends + " year");
	}
	
	public void getSchool(){
		System.out.println(name + "'s" + " school is " + school);
	}
	
	public void getMajor(){
		System.out.println(name + " is a " + major);
	}
	
	public void getOccupation(){
		System.out.println(name + " is a " + occupation);
	}
	
	public void getMarried(){
		if (married){
			System.out.println(name + " is married.");
		} else{
			System.out.println(name + " is not married.");
		}
	
	}
	
	public void getKids(){
		if (kids){
			System.out.println(name + " does have kids.");
		} else {
			System.out.println(name + " does not have kids.");
		}
	
	}
	
	public void getIsOnline(){
		if (isOnline){
			System.out.println(name + " is online!");
		}else{
			System.out.println(name + " is not online.");
		}
	}
	
	
	
	
	
	
	
}
