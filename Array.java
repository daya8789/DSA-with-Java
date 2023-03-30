
public class Array {
	public static void main(String[] args) {
		int a[] = new int[5];
		for(int i=0; i<5; i++) {
			a[i] = i;
		}
		a[2] = 34;
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
	}
}
