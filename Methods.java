import java.util.*;
public class Methods {

//	public static void printMyName(String name) {
//		System.out.println(name);
//		return;
//	}
	
	
//	public static int calculateSum(int a, int b) {
//		int sum = a+b;
//		return sum;
//	}
	
	public static int calculateProduct(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String name;
//		System.out.print("Enter the name : ");
//		name = sc.next();
//		System.out.println("Your name is : "+name);

		int a, b, sum;
		System.out.print("Enter the number a : ");
		a = sc.nextInt();
		System.out.print("Enter the number b : ");
		b = sc.nextInt();
		
//		sum = calculateSum(a, b);
//		System.out.println("The sum of two number is : "+sum);
	
		
		System.out.println("The product of two number is "+calculateProduct(a, b));
		
		
	}

}
