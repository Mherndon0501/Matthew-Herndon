import java.util.Scanner;

class letterTime
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your letter?");
        System.out.println("(Only enter a single letter, no signs, no words, ONLY LETTER)");
        System.out.println("Enter CAPITAL letter here:");
        char letter = scanner.next().charAt(0);

        if ((letter == 65) || (letter == 69) || (letter == 73) || (letter == 79) || (letter == 85))
        {
            System.out.println("Your letter is a vowel! :)"); 
        }
        else
        {
            System.out.println("Your letter is not a vowel :(");
        }

    }
}
