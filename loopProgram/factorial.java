import java.util.Scanner;

class factorial 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your number? (below 15)");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int num1 = scanner.nextInt();
        int num2 = 1;

        while (num1 > 1) 
        {
            num2 = num2 * num1;
            num1--;
        }

        System.out.println("Factorial: " + num2);
    }
}