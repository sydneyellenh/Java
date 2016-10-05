package _16_Interfaces;

public class Main {

	public static void main(String[] args) {

		//Create CD and DVD object
		//Call methods
		
		CD frankTurner = new CD();
		frankTurner.getTitle("Positive Songs for Negative People by Frank Turner");
		frankTurner.play();
		frankTurner.pause();
		frankTurner.turnUpTo(11);
		
		DVD downtonAbbey = new DVD();
		downtonAbbey.getTitle("Downton Abbey");
		downtonAbbey.play();
		downtonAbbey.pause();
		downtonAbbey.skipScene();
		
		BluRay weeksLater = new BluRay();
		weeksLater.getTitle("28 Weeks Later");
		weeksLater.play();
		weeksLater.pause();
		weeksLater.skip();
		weeksLater.menu();
		weeksLater.watchExtras();
		
		
		
		
		
		
		
	}

}
