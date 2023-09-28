import java.util.Scanner;

class add1
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Put in a number to be added");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int num1 = scanner.nextInt();
        
        System.out.println("Put in another number to be added");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2 + " Is your final number");
    }
}
