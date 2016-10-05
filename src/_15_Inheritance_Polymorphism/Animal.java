package _15_Inheritance_Polymorphism;

public class Animal {

	
	//Properties
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifespan;
	
	public String name;
	public String habitat;
	public String species;
	
	public boolean isWarmblooded;
	
	//Methods
	
	public void printName(){
		System.out.println("My name is " + name + " and I am a " + species + "!");
	}
	
	public void speak() {
		System.out.println("I am animal");
	}
	
	public void fight(){
		System.out.println("I can fight!");
	}
	
	
	
	//TODO figure out how to make a bool/input/output and loop
	//that recognizes what words to use 'a' or 'an' depending on the
	//animal species
	//ie: for bear = a || alligator = an
	
	
	
	
}
