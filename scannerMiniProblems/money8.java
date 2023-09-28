import java.util.Scanner;

class money8
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Convert USD to CAD");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter your USD amount here:");
        int usd = scanner.nextInt();

        double cad = usd * 1.35;

        System.out.println(cad + " Is how many Candian dollars you have. Thanks for converting!");
    }
}