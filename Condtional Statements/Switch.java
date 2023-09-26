import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Order to pressing the number : ");
        int number = sc.nextInt();

        switch(number){
            case 1 : System.out.println("Burger");
                break;
            case 2 : System.out.println("Pizza");
                break;
            case 3 : System.out.println("Sweets");
                break;
            default : System.out.println("Your choice is not found!\nPlease Try somethig other");
        }
    }
    
}
