package JavaPractice;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_balance);
		HSBCBank hsb= new HSBCBank();
		hsb.credit();
		hsb.debit();
		hsb.transferMoney();
		hsb.educationLoan();
		hsb.carLoan();
		hsb.mutualFunds();
		hsb.Lifeinsurance();
	    USBank.Digitalsign();
	    hsb.statement();
		
		/*USBank usb=new HSBCBank();
		usb.credit();
		usb.debit();
		usb.transferMoney();*/
		
	}

}
