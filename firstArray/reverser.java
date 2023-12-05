import java.util.Scanner;

class reverser 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many words are you going to use?");
        int index = scanner.nextInt();
        scanner.nextLine();

        String[] firstArray = new String[index];

        while (index >= 0) 
        {
            System.out.println("What is your word?");
            String userWord = scanner.nextLine();
            firstArray[index] = userWord;
            index--;
        }

        System.out.println("reversed words :o");
        while(firstArray[index] != null)
        {
            System.out.print(firstArray[index]);
            index--;
        }
    }
}