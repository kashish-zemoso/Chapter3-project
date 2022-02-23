import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {

        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("Random number is:\t" + myRandomNumber);

        myRandomNumber = random.nextInt(1000);
        System.out.println("Random number between 0-999:\t" +myRandomNumber);

        //Shifting
        myRandomNumber = random.nextInt(1000)+1;
        System.out.println("Random number between 1-1000:\t" +myRandomNumber);
    }
}
