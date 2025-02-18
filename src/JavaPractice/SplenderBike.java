package JavaPractice;

public class SplenderBike extends Bike {
   
	int speed;
	int lights;
	
	@Override
	void start() {
		System.out.println("Splender Start");
	}
	
	void stand() {
		System.out.println("Splender Stand");
	}
	
	void powerBreak() {
	    System.out.println("Splender Power Break");
	}
	
	@Override
	void stop() {
		System.out.println("Splender stop");
	}
	
}
