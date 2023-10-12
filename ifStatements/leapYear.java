import java.util.Scanner;

class leapYear
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the year?");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int year = scanner.nextInt();

        if (year % 4 == 0)
        {
            System.out.println("Your on a leap year! Now go jump"); 
        }
        else
        {
            System.out.println("No yeap year, go sit down  :,(");
        }

    }
}
