import java.util.*;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        String type = ((number % 2 == 0) ? "Even" : "Odd");
        System.out.println(type);
    }
}
