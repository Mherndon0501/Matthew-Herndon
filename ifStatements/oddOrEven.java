import java.util.Scanner;

class numberDecider
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your number?");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int num = scanner.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Your number is even! :)"); 
        }
        else
        {
            System.out.println("Your number is odd :(");
        }

    }
}