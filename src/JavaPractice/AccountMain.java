package JavaPractice;

public class AccountMain {

	public static void main(String[] args) {
		Account acc= new Account();
		acc.setAccno(101);
		System.out.println(acc.getAccno());
		
		acc.setName("Rajesh");
		System.out.println(acc.getName());
	}

}
