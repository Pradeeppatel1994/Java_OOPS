package Practices;

public class HSBCBank implements USBank,UKBank{

	@Override
	public void debit() {
	System.out.println("HSBCBank...debit");
		
	}

	@Override
	public void credit() {
		System.out.println("HSBCBank...credit");	
		
	}

	@Override
	public void trasferMoney() {
		System.out.println("HSBCBank...transfermoney");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("HSBCBank...withdrawMoney");
	}
	
	
	public void loan() {
		System.out.println("HSBC...Loan");
	}

	@Override
	public void mutualFund() {
		System.out.println("HSBCBank...mutualFund");
	}

	@Override
	public void autoDeduction() {
		System.out.println("HSBCBank...autodeduction");
		
	}
	
	int min_balance=500;

}


