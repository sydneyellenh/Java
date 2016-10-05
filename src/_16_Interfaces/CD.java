package _16_Interfaces;

public class CD implements IFunctions{

	@Override
	public void play() {
		System.out.println("CD is now playing.");
		
	}

	@Override
	public void pause() {
		System.out.println("CD is paused.");
		
	}

	@Override
	public void stop() {
		System.out.println("CD is paused.");
		
	}

	@Override
	public void skip() {
		System.out.println("Skip track.");
	}

	@Override
	public void menu() {
		System.out.println("Go to CD menu.");
		
	}

	public void turnUpTo(int volume){
		System.out.println("Turn up to " + volume + "!");
	}

	@Override
	public void getTitle(String title) {
		System.out.println("The title of your CD is " + title + ".");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
