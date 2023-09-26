public class If_else{
    public static void main(String[] args) {
        int age = 16;
        if(age >= 18){
            System.out.println("Adults: Voter, Driving Lisence");
        }
        if(age>12 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}