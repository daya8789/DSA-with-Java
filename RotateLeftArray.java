import java.util.*;
public class RotateLeftArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		System.out.println("Enter the size of array :");
		n = scan.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements of array : ");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("The array is :");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+"  ");
		}
		
		// Rotate the array
		int temp = arr[0];
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
		
		System.out.println();
		System.out.println("The Rotated array is :");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		scan.close();
	}
}
