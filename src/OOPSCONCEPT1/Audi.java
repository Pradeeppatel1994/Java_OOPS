package OOPSCONCEPT1;

public class Audi extends Car {

	
	@Override
	public void start() {
		System.out.println("Audi...Start");
	}

	@Override
	public void run() {
		System.out.println("Audi...Run");
	}
	
	@Override
	public void powerBreak() {
		System.out.println("Audi....PowerBreak");
	}
	
	@Override
	public void stop() {
		System.out.println("Audi...Stop");
	}
	
	
	
}
