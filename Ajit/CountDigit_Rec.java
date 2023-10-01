package Ajit;

public class CountDigit_Rec {
	public static int countDigit(long n) {
		if(n/10 == 0) {
			return 1;
		}
		return 1+countDigit(n/10);
	}
	public static void main(String[] args) {

		long n= 325234450;
		System.out.println("The number of digits are : "+countDigit(n));

	}

}
