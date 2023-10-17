import java.util.Scanner;

class age
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int age = scanner.nextInt();

        if (age < 0)
        { 
            System.out.println("No negative numbers");
        }

        else if (age < 13)
        {
            System.out.println("You are a kid"); 
        }
        else if (age < 19)
        {
            System.out.println("You are a teen");
        }

        else if (age < 65)
        {
            System.out.println("You are an adult");
        }
        else if (age < 116)
        {
            System.out.println("You are old");
        }
        else if (age > 116)
        {
            System.out.println("You are a spooky ghost");
        }
    }
}