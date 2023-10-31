import java.util.Scanner;

class stringReverse
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your word");
        System.out.println("(Only enter a word, no signs, no number, ONLY WORDS)");
        System.out.println("Enter here:");
        String userWord = scanner.next();
        String backwards = "";

            for(int i = 0; i < userWord.length(); i++)
            {
                backwards += userWord.charAt(userWord.length() - 1 - i);
            }

            for(int i = 0; i < backwards.length(); i++)
            {
                System.out.println(backwards.substring(i));
            }
    }
}