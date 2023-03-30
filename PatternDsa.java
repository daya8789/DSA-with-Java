import java.util.Scanner;
public class PatternDsa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		System.out.print("Enter the number of n : ");
		n = sc.nextInt();
//		System.out.print("Enter the value of column : ");
//		m = sc.nextInt();
		
		System.out.println("The pattern is :");
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=m; j++) {
//				System.out.print(" * ");
//				//System.out.print(" ");
//			}
//			System.out.println("");
//		}
		
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=m; j++) {
//				if(i==1 || j==1 || i==n || j==m) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println("");
//		}
		
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=n; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
		
		
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println("");
//		}
		
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println("");
//		}
		
		
//		int number=1;
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(number+"  ");
//				number++;
//			}
//			System.out.println("");
//		}
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				int sum = i+j;
				if(sum%2==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
	}

}
