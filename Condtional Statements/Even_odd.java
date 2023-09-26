import java.util.*;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
    }
}
