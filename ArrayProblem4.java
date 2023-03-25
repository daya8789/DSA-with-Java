import java.util.*;

public class ArrayProblem4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size;
		System.out.println("Enter the Size of array :");
		size = scan.nextInt();
		int number[] = new int[size];
		System.out.println("Enter the elements of array :");
		for(int i=0; i<size; i++) {
			number[i] = scan.nextInt();
		}
		System.out.println("The elements are :");
		for(int i=0; i<size; i++) {
			System.out.print(number[i]+" ");
		}
		
		boolean isAccending = true;
		for(int i=0; i<number.length-1; i++) {
			if(number[i] > number[i+1]) {
				isAccending = false;
			}
		}
		if(isAccending) {
			System.out.println("\nArray is in Accending order");
		}else {
			System.out.println("\nArray is not in Accending order");
		}

	}

}
