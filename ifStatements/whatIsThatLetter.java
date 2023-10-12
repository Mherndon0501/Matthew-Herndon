import java.util.Scanner;

class letterTime
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your letter?");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int letter = scanner.nextInt();

        if (charletter == 65)
        {
            System.out.println("Your number is even! :)"); 
        }
        else
        {
            System.out.println("Your number is odd :(");
        }

    }
}
