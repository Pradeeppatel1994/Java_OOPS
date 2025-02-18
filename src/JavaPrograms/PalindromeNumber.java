package JavaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 16461;
		int original_num = num;
		int resrv = 0;

		while (num != 0) {

			resrv = resrv * 10 + num % 10;
			num = num / 10;
		}
		if (original_num == resrv) {
			System.out.println("Number is Palindrome: "+original_num);
		} else {
			System.out.println("Number is Not a Palindrome:"+original_num);
		}

	}

}
