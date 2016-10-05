package _15_Inheritance_Polymorphism;

public class Kangaroo extends Animal{

	public boolean carryYoungInPouch;
	
	@Override
	public void speak(){
		System.out.println(name + " says: #savebarb");
	}
	
	public void fight(){
		System.out.println(name + " must fight : I'll kick you!!");
	}
	
	
}
