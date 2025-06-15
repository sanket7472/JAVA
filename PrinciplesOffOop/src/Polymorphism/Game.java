package Polymorphism;

public class Game {

	int bullets = 30;
	
	public void turnRight() {
		System.out.println("Turned Right..!");
		
	}
	
	public void turnLeft() {
		System.out.println("Turned Right..!");
		
	}
	
	public void moveForword(int steps){
		
		System.out.println("went forword "+steps +" steps");
	}
	
	public void moveBackword(int steps){
		
		System.out.println("went forword "+steps +" steps");
	}
	
	public void fire() {
		if (bullets>0) {
			bullets--;
			System.out.println("Fired...!");
			System.out.println(bullets+"  Bullets left ");
			
		}
		else {
			System.out.println("Please reload your weapon...!");	
		}
	}
	
	public void reload() {
		bullets = 30;
		System.out.println("Weaopn reloaded...!");
	}
}
