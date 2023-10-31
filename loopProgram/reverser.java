import java.util.Scanner;

class reverser
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your word");
        System.out.println("(Only enter a word, no signs, no number, ONLY WORDS)");
        System.out.println("Enter here:");
         String userWord = scanner.next();

            for(int i = userWord.length() - 1; i >= 0; i--)
            {
                System.out.print(userWord.charAt(i));
            }
    }
}