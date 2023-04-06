import java.util.Scanner;
public class CharCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
