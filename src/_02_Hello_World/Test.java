package _02_Hello_World;

import _17_Encapsulation.ColtsPlayers;

public class Test {

	public static void main(String[] args) {

		ColtsPlayers luck = new ColtsPlayers();
		luck.name = "Andrew Luck";
		luck.setNumber(48);
		luck.getNumber();
		System.out.println(luck.getNumber());
		System.out.println(luck.name);
		
		
		
	}

}
