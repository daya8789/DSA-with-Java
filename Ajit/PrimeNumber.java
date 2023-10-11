package Ajit;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		
		if(n == 2) {
			System.out.println(n+" is Prime Number.");
		}else {
			boolean isPrime = true;
			for(int i=2; i<=Math.sqrt(n); i++) {
				if(n%i == 0) {
					isPrime = false;
				}
			}
			
			if(isPrime == true) {
				System.out.println(n+" is Prime Number.");
			}else {
				System.out.println(n+" is not Prime Number.");
			}
		}
		

	}

}
