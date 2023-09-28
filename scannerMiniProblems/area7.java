import java.util.Scanner;

class area7
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the radius");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int r = scanner.nextInt();

        double a = 3.14 * (r * r);

        System.out.println(a + " Is the area of the circle");
    }
}