import java.util.Scanner;
import java.util.Random;

class guesser
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello contestant, you have been randomly picked to participate in today's round of....");
        System.out.println("Price");
        System.out.println("Is");
        System.out.println("Right!");
        System.out.println("Please welcome your host, Matthew Herndon!");
        System.out.println("Matthew: Hello everyone, I'm Matthew Herndon and I'm here with a very special mini-game!");
        System.out.println("Matthew: Our contestant here is going to guess the price...");
        System.out.println("Matthew: Of this Pokemon card!");
        System.out.println("Matthew: Alright contestant, give a guess below 500!");

        int attemps = 0;

        Random rand = new Random();
        int price = rand.nextInt(501);

        int numGuessed = scanner.nextInt();

        while (numGuessed != price) 
        {

            if(numGuessed > price)
            {
                System.out.println("Too high!");
            }
            if(numGuessed < price)
            {
                System.out.println("Too low!");
            }

            attemps++;
            System.out.print("Matthew: So far you've taken " + attemps + " attempt(s) so far! Try again: ");
            numGuessed = scanner.nextInt();

        }
        System.out.println("Great job! The price was $" + price);
        System.out.println("Thank you for playing...");
        System.out.println("Price");
        System.out.println("Is");
        System.out.println("Right!");
    }
}
