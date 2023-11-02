import java.util.Scanner;

public class InstancesOf {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your word?");
        System.out.println("(Only enter a word, no signs, no numbers, ONLY WORDS)");
        System.out.println("Enter here:");
        String userWord = scanner.next();

        System.out.println("What is the letter you would like to find?");
        System.out.println("(Only enter a letter, no signs, no numbers, ONLY LETTERS)");
        System.out.println("Enter here:");
        String letter = scanner.next();

        int count = 0;
        for (int i = 0; i < userWord.length(); i++) 
        {
            if (userWord.charAt(i) == letter.charAt(0)) 
            {
                count++;
            }
        }

        if (count > 0) 
        {
            System.out.println(letter + " is found " + count + " times in " + userWord + ".");
        } 
        else 
        {
            System.out.println(letter + "is not found in " + userWord + ".");
        }
    }
}






