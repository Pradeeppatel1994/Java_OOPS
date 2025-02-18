package JavaPractice;

public class HSBCBank implements USBank,BrazilBank{

	public void credit() {
		System.out.println("HSBC...Credit");	
	}

	public void debit() {
		System.out.println("HSBC... Debit");
	}

	public void transferMoney() {
		System.out.println("HSBC...Money Transfer");
	}
	
	public void educationLoan() {
		System.out.println("HSBC...Education Loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC...Car Loan");
	}


	public void mutualFunds() {
		System.out.println("HSBC...MutualFunds");
	}

	public void Lifeinsurance() {
		System.out.println("HSBC...LifeInsurance");	
	}
	

}
