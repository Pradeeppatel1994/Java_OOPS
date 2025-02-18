package JavaPractice;

public class BikeMain {

	public static void main(String[] args) {
		SplenderBike sb = new SplenderBike();
		sb.name="Super Splender";
		sb.modal=2022;
		sb.wheel=4;
		sb.color="RED";
		
		/*System.out.println(sb.name);
        System.out.println(sb.modal);
        System.out.println(sb.wheel);
        System.out.println(sb.color);
         sb.start();
         sb.horn();
         sb.pressbreak();
         sb.stop();
         sb.stand();
         sb.powerBreak(); */
		
		sb.start();
		sb.pressbreak();
		sb.horn();
		sb.stop();
		sb.stand();
		sb.powerBreak();
		       
	}

}
