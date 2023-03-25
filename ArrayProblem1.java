import java.util.Scanner;
public class ArrayProblem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Taking an array as an input and printing its elements.
		int n;
		System.out.println("Enter the Size of Array : ");
		n = scan.nextInt();
		int number[] = new int[n];
		System.out.println("Enter the Elements of array : ");
		for(int i=0; i<n; i++) {
			number[i] = scan.nextInt();
		}
		
		System.out.println("The elements of the array are : ");
		for(int i=0; i<n; i++) {
			System.out.print(number[i]+" ");
		}

	}

}
