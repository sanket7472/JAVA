package Polymorphism;

public class GameDriver {

	public static void main(String[] args) {
		
		Game g1 = new GameV2();
		
		g1.fire();
		g1.moveBackword(10);
		g1.turnLeft();
		g1.moveBackword(20);
	}
}
