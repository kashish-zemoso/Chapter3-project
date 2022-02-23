import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter any number");
        num = input.nextInt();

        if(num%3 == 0){
            System.out.println(num + " is divisible by 3");
        }
        else{
            System.out.println(num + " is not divisible by 3");
        }
    }
}
