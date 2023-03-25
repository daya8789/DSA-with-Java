import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int rows, cols;
		System.out.println("Enter the number of rows and cols :");
		rows = scan.nextInt();
		cols = scan.nextInt();
		int[][] twodarray = new int[rows][cols];
		System.out.println("Enter the elements of arrays :");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				twodarray[i][j] = scan.nextInt();
			}
		}
		
		int x;
		System.out.println("Please enter the element to search :");
		x = scan.nextInt();
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				System.out.print(twodarray[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(twodarray[i][j] == x) {
					System.out.println("The location of the element is "+"("+i+","+j+")");
				}
			}
		}
	}

}
