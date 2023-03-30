import java.util.Scanner;
public class ArraysDsa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int[] marks = new int[3];
//		marks[0] = 97;		// phy
//		marks[1] = 98;		// chem
//		marks[2] = 94;		// Eng
		
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
		
//		for(int i=0; i<3; i++) {
//			System.out.println(marks[i]);
//		}
		
		int size, x;
		System.out.print("Enter the size of array : ");
		size = sc.nextInt();
		int number[] = new int[size];
		System.out.println("Enter the elements of array :");
		for(int i=0; i<size; i++) {
			number[i] = sc.nextInt();
		}
		System.out.print("The array is : ");
		for(int i=0; i<size; i++) {
			System.out.print(number[i]+" ");
		}
		
		System.out.print("\nEnter the number which you want to search : ");
		x = sc.nextInt();
		System.out.print("The index number is : ");
		for(int i=0; i<number.length; i++) {
			if(number[i] == x) {
				System.out.println(i);
			}
		}
	}

}
