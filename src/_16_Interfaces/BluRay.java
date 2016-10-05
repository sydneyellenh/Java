package _16_Interfaces;

public class BluRay implements IFunctions{

	@Override
	public void play() {
		System.out.println("Bluray: Play player");
		
	}

	@Override
	public void pause() {
		System.out.println("Bluray: Pause player");
		
	}

	@Override
	public void stop() {
		System.out.println("Bluray: Stop player");
		
	}

	@Override
	public void skip() {
		System.out.println("Bluray: Skip");
		
	}

	@Override
	public void menu() {
		System.out.println("Bluray: Go to menu");
		
	}

	public void watchExtras(){
		System.out.println("Watch exclusive extras!");
	}

	@Override
	public void getTitle(String title) {
		System.out.println("The title of your movie is " + title + ".");
	}


}
