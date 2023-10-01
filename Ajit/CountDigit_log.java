package Ajit;

public class CountDigit_log {
	
	public static int countDigit(long n) {
		return (int)Math.floor(Math.log10(n)+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 23423534;
		System.out.println("The number of digits are : "+countDigit(n));

	}

}
