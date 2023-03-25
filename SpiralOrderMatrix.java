import java.util.Scanner;
public class SpiralOrderMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, m;
		System.out.println("Enter the row and column of matrix :");
		n = scan.nextInt();
		m = scan.nextInt();
		
		int[][] spiralmatrix = new int[n][m];
		System.out.println("Enter the elements of matrix :");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				spiralmatrix[i][j] = scan.nextInt();
			}
		}

		System.out.println("The Spiral Order Matrix is :");
		
		int rowStart = 0;
		int rowEnd = n-1;
		int colStart = 0;
		int colEnd = m-1;
		
		while(rowStart <= rowEnd && colStart <= colEnd) {
			
			// 1
			for(int col=colStart; col<=colEnd; col++) {
				System.out.print(spiralmatrix[rowStart][col]+" ");
			}
			rowStart++;
			
			// 2 
			for(int row=rowStart; row<=rowEnd; row++) {
				System.out.print(spiralmatrix[row][colEnd]+" ");
			}
			colEnd--;
			
			// 3
			for(int col=colEnd; col>=colStart; col--) {
				System.out.print(spiralmatrix[rowEnd][col]+" ");
			}
			rowEnd--;
			
			// 4
			for(int row=rowEnd; row>=rowStart; row--) {
				System.out.print(spiralmatrix[row][colStart]+" ");
			}
			colStart++;
			
			System.out.println();
		}
	}

}
