import java.util.Scanner;
public class PracticeSet1Dsa {
	
	//Enter 3 numbers from the user & make a function to print their average
//	public static int average(int a, int b, int c) {
//		int avg = (a+b+c)/3;
//		return avg;
//	}
	
	//Write a function to print the sum of all odd numbers from 1 to n.
	public static int printSumOdd(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				//		
//		int a, b, c, avg;
//		System.out.print("Enter the First number : ");
//		a = sc.nextInt();
//		System.out.print("Enter the Second number : ");
//		b = sc.nextInt();
//		System.out.print("Enter the third number : ");
//		c = sc.nextInt();
//		
//		System.out.println("The average is : "+average(a, b, c));
				
		
					//	Question no 2
		int n;
		System.out.print("Enter the number : ");
		n = sc.nextInt();
		
		System.out.println("The sum of odd number is : "+printSumOdd(n));

	}

}
