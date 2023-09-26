import java.util.*;

public class Else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Adults");
        }
        else if(age > 12 && age < 18){
            System.out.println("Teenager");
        }else{
            System.out.println("Child");
        }
    }
}
