import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int answer,guess;

       final int MAX=5;
        Scanner input=new Scanner(System.in);
        Random rand = new Random();

        answer = rand.nextInt(MAX)+1;

        System.out.println("Guess a number between 1 and 5");

        guess=input.nextInt();


        if (guess==answer)
        {

            System.out.println("Good job,the nu,mber was"+answer);
        }else
        {

            System.out.println("Sorry, but the number was"+answer);
        }


    }
}