import java.util.Scanner;

class firstArray
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        String [] firstArray = new String[20];
        boolean exit = false;
        int index = 0;

        while(exit != true)
        {
            System.out.println("What is your word? Type \"exit\" to quit.");
            System.out.println("No more words than 20, Enter here:");
            String userWord = scanner.next();

            if(userWord.equals("exit"))
            {
                exit = true;
            }
            else
            {
                firstArray[index] = userWord;
                index++;
            }
        
        }
        index = 0;

        while(firstArray[index] != null)
        {
            System.out.print(firstArray[index]);
            index++;
        }
    }
}