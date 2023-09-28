import java.util.Scanner;

class temp4
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the temperature?(In celsius)");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int c = scanner.nextInt();

        int f = (c * 9/5) + 32;

        System.out.println(f + " Is the temperature in fahrenheit!");
    }
}