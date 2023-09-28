import java.util.Scanner;

class interest6
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How much money do you owe?");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int principle = scanner.nextInt();

        System.out.println("What is the interest rate?");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int rate = scanner.nextInt();

        int extraCash = (principle / 100) * rate;

        System.out.println("$" + extraCash + " Is the extra money you owe me.");

        int finalNumber = extraCash + principle;

        System.out.println("$" + finalNumber + " Is all the money you owe me.");
    }
}