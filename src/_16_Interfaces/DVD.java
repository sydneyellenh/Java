package _16_Interfaces;

public class DVD implements IFunctions {

	@Override
	public void play() {
		System.out.println("Play DVD.");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause DVD.");
	}

	@Override
	public void stop() {
		System.out.println("Stop DVD.");
	}

	@Override
	public void skip() {
		System.out.println("Skip forward or backwards on DVD.");
	}

	@Override
	public void menu() {
		System.out.println("Go to main menu.");
	}

	public void skipScene(){
		System.out.println("Skip this scene.");
	}

	@Override
	public void getTitle(String title) {
		System.out.println("The title of your DVD is " + title + ".");

	}

	
	
	
	
	
	
	
}
