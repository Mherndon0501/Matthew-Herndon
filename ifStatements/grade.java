import java.util.Scanner;

class grades
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your grade?");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");

        int grade = scanner.nextInt();

        if (grade < 0)
        { 
            System.out.println("No negative numbers, how are you even making grades that low?!?!");
        }

        else if (grade < 60)
        {
            System.out.println("You need to get poggers, you have an F"); 
        }
        else if (grade < 70)
        {
            System.out.println("You got a D, how are you that low?");
        }

        else if (grade < 80)
        {
            System.out.println("You have a C, try harder");
        }
        else if (grade < 90)
        {
            System.out.println("You have a B, were getting there");
        }
        else if (grade > 89)
        {
            System.out.println("Yay! You don't get a whooping from your mom! (You got an A)");
        }
    }
}