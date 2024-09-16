package OOPSCONCEPT1;

public class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW...Start");
	}
	public void engine() {
		System.out.println("BMW...HighPower Engine");
	}
	
	@Override
	public void powerBreak() {
		System.out.println("BMW...Powerbreak");
	}
	
	public void ledLight() {
		System.out.println("BMW...LEDLight");
	}
	@Override
	public void stop() {
		System.out.println("BMW....Stop");
	}
	
	
}
