import java.util.*;
public class ArrayProblem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Take an array of names as input from the user and print them on the screen.

		int n;
		System.out.println("Enter the Size of the array is : ");
		n = scan.nextInt();
		String name[] = new String[n];
		System.out.println("Enter the names as input in array : ");
		for(int i=0; i<n; i++) {
			name[i] = scan.next();
		}
		
		System.out.println("The Stored Names are :");
		for(int i=0; i<n; i++) {
			System.out.print(name[i]+" ");
		}

	}

}
