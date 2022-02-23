import java.util.Scanner;

public class Fraternity {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age;
        char gender;

        System.out.println("Welcome to the Fraternity Campus");
        System.out.println("Please enter your age");
        age = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your gender");
        gender = input.next().charAt(0);

        if(age >= 19 && (gender == 'M' || gender == 'm')){
            System.out.println("You're eligible to join the fraternity");
        }
        else{
            System.out.println("You're not eligible to join the fraternity");
        }
    }
}
