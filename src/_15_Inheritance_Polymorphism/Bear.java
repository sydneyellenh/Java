package _15_Inheritance_Polymorphism;

public class Bear extends Animal{

	public boolean isHibernating;
	
	@Override
	public void speak(){
		System.out.println(name + " says: I am the demagorgon!");
	}
	
	public void fight(){
		System.out.println(name + " must fight : I will tear my way through you with my claws and teeth!");
	}
	
}
