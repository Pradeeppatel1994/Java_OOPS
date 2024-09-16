package OOPSCONCEPT2;

public class ThrowKeyword {

	public static void main(String[] args) {

		System.out.println("ABC");

		try {
			throw new Exception("Pradeep Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("PQR");
		
		
		String Exe_file ="N";
		if(Exe_file.equals("N")) {
			try {
				throw new Exception("Exe file is No Exception");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
