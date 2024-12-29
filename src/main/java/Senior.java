import java.util.Scanner;

public class Senior {
    public static void main(String[] args) {
        //create a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        //tell the user to enter their age
        int age = scanner.nextInt();
        //check if age qualifies for a senior discount
        if(age >=65){
            System.out.println("you qualify for the discount");
        }else {
            System.out.println("you do not qualify for the discount ");
        }
    }
}
