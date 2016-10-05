package _15_Inheritance_Polymorphism;

public class Mouse extends Animal{

	
	@Override
	public void speak (){
		System.out.println(name + " says: Ima smash your camera, nerd!");		
	}
	
	public void fight(){
		System.out.println(name + " must fight : *runs away*");
	}
	
	
	
}
