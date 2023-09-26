import java.util.*;

public class Switch_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int first = sc.nextInt();
        System.out.println("Enter the second number : ");
        int second = sc.nextInt();
        System.out.println("Enter the Operator : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println("The sum is : "+(first+second));
            break;
            case '-' : System.out.println("The Subtraction is : " + (first - second));
            break;
            case '*' : System.out.println("The multiplication is : "+(first * second));
            break;
            case '/' : System.out.println("The Divided result is : "+(first / second));
            break;
            case '%' : System.out.println("The Remender is : "+(first % second));
            break;
            default : System.out.println("Invalid Operation");
        }
    }
}
