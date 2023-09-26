import java.util.*;

public class Ternary_S_P_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks in % : ");
        int marks = sc.nextInt();
        String Status = (marks>=33) ? "PASS" : "FAIL";
        System.out.println(Status);
    }
}
