import java.util.Scanner;

public class EvenOnly {
    public static void main(String[] args) {

        System.out.println("Printing Even Nos: ");
        for(int i=0;i<10;i++){
            if(i%2 == 0){
                System.out.print(i + "\t");
            }
            else{
                continue;
            }
        }
    }
}
