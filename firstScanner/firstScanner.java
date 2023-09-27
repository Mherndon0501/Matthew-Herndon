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

        System.out.println("You have " + money + " dollars right now");

        System.out.println("");
        System.out.println("");

        System.out.println("The Government (me) infroced a higher tax policy. I'm now taking 50% of your money");
        money /= 2;
        System.out.println("You now have " + money + " dollars left");
        System.out.println("");
        System.out.println("");
        System.out.println("Would you look at that! You found a dollar on the floor!");

        money ++;
        System.out.println("You now have " + money + " dollars left");
        
        System.out.println("So, turns out that Playstation got hacked. A bunch of hackers stole that money, and now Playstation is giving you your money back.");
        System.out.println("How much money did they give you? Enter here:");
        int extraCash = scanner.nextInt();
        System.out.println(extraCash + money + " Is how much money you have right now");
    }
}
