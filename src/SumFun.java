import java.util.Scanner;

public class SumFun {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int sum=0;
        int input;

        System.out.println("Enter non-negative integers to sum");
        System.out.println("Enter a negative integer to exit!");
        input = keyboard.nextInt();

        while(input >= 0){
            sum += input;
            System.out.println("Enter non-negative integers to sum");
            System.out.println("Enter a negative integer to exit!");
            input = keyboard.nextInt();
        }
        System.out.println("Sum is " + sum);
    }
}
