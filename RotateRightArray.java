import java.util.Scanner;

public class RotateRightArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		System.out.println("Enter the size of array :");
		n=scan.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the Element of array :");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("The array is :");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		// rotate the array
		int temp = arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
		System.out.println();
		System.out.println("The shifted array is :");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		scan.close();
	}

}
