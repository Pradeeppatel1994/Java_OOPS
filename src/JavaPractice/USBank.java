package JavaPractice;

public interface USBank {
  
	int min_balance=100;
	public void credit();
	public void  debit();
	public void transferMoney();
	
	static void Digitalsign() {
		System.out.println("USBank...Digitalsign");
	}
	
	default void statement() {
		System.out.println("USBank...statement");
	}
	
}
