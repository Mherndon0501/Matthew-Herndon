import java.util.Scanner;

class firstScanner
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have?");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int money = scanner.nextInt();

        System.out.print("You have " + money + " dollars left");

        System.out.println("The Government (me) infroced a higher tax policy.");
        money /= 2;
        System.out.println("You now have " + money + " dollars left");


    }
}
