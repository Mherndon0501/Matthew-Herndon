import java.util.Scanner;

class temp5
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the temperature?(In fahrenheit)");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int f = scanner.nextInt();

        int c = (f - 32) * 5/9;

        System.out.println(c + " Is the temperature in celsius!");
    }
}