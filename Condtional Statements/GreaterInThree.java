import java.util.*;

public class GreaterInThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is greater than "+b+" and "+c);
        }
        else if(b>a && b>c){
            System.out.println(b+" is greater than "+a+" and "+c);
        }
        else{
            System.out.println(c+" is greater than "+a+" and "+b);
        }
    }
}
