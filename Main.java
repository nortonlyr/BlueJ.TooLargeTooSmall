
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;

public class Main
{
    // instance variables - replace the example below with your own
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int number = rand.nextInt(10) + 1;
        int count = 0;
        int guess = 0;
        


    
    public Main()
    {
        
       System.out.println("Guess a number between 1 and 10: ");
       
       while (guess != number){
            guess = input.nextInt();
            count++;
            if (guess > number) {
                System.out.println("Guess lower:");
            }
             else if (guess < number) {
                System.out.println("Guess higher:");
             }
             else {
                System.out.println("Congrats! " + guess + " is the number! You guessed " + count + " times.");
            }

        }
    }

}
