import java.util.Scanner;

class multiply2
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Put in a number to be doubled");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int num1 = scanner.nextInt();

        int num2 = num1 * 2;

        System.out.println(num2 + " Is your final number");
    }
}
