import java.util.*;

public class Natural_Sum {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0, n;
		System.out.println("Enter the number at which you want the sum : ");
		n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of natural number is : "+sum);
		
		
	}
}
