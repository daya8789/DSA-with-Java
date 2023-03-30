import java.util.Scanner;
public class AdvancedPatternDsa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		System.out.print("Enter the number : ");
		n = s.nextInt();
		
		//Butterfly pattern				*****
		
//		// Upper half
//		for(int i=1; i<=n; i++) {
//			//First half
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			//for spaces
//			int spaces = 2*(n-i);
//			for(int j=1; j<=spaces; j++) {
//				System.out.print("  ");
//			}
//			//Second half
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//
//		// Lower half
//		for(int i=n; i>=1; i--) {
//			//First half
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			//for spaces
//			int spaces = 2*(n-i);
//			for(int j=1; j<=spaces; j++) {
//				System.out.print("  ");
//			}
//			//Second half
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
		
		
		
		// Solid rhombus			*****
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=(n-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=n; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// Hollow rhombus				*****
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=(n-i); j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=n; j++) {
//				if(i==1 || i==n || j==1 || j==n) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		//Pyramid pattern					******
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
		
		// Palindromic pattern					*****
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=i; j>=1; j--) {
//				System.out.print(j);
//			}
//			for(int j=2; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println("");
//		}
		
		
		// Diamond shape pattern
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
