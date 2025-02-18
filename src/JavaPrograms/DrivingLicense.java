package JavaPrograms;

public class DrivingLicense {
	
	  void drivingLicence(int age) {
		  if(age>18) {
				System.out.println("Congrats!You'r Eligible for the Driving Licence");
			}
			else if(age==18) {
				System.out.println("You'r Just Become Eligible for the Driving Licence");
			}
			
			else {
				System.out.println("Sorry!You'r not Eligible for the Driving Licence");
			}
	  }

	public static void main(String[] args) {
		
		//int age =18;
		/*
		if(age>18) {
			System.out.println("Congrats!You'r Eligible for the Driving Licence");
		}
		else if(age==18) {
			System.out.println("You'r Just Become Eligible for the Driving Licence");
		}
		
		else {
			System.out.println("Sorry!You'r not Eligible for the Driving Licence");
		}*/
		
		DrivingLicense dl = new DrivingLicense();
		dl.drivingLicence(18);
		
		
		
	}

}
