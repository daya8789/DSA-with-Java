import java.util.*;
public class ArrayProblem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Find the maximum & minimum number in an array of integers.
		int n;
		System.out.println("Enter the size of Array : ");
		n = scan.nextInt();
		int number[] = new int[n];
		System.out.println("Enter the elements of the array :");
		for(int i=0; i<n; i++) {
			number[i] = scan.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<number.length; i++) {
			if(number[i]>max) {
				max = number[i];
			}
			if(number[i]<min) {
				min = number[i];
			}
		}
		System.out.println("The maximum value is: "+max);
		System.out.println("The minimum value is: "+min);
		
	}

}
