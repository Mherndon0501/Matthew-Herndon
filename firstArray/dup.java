import java.util.Scanner;

class dupVal
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        String [] firstArray = new String[25];
        boolean exit = false;
        int index = 0;
        
        System.out.println("No more words than 25, Enter here:");

        while(exit != true)
        {
            System.out.println("What is your word? Type \"exit\" to quit.");
            String userWord = scanner.nextLine();

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

        int numOfSpaces = index;
        index = 0;
        String firstDup = "";
        boolean dup = false;

        for (int i = 0; !dup && i < numOfSpaces; i++) 
        {
            for (int j = i + 1; j != numOfSpaces; j++) 
            {
                if(firstArray[i].equals(firstArray[j])) 
                {
                    dup = true;
                    firstDup = firstArray[i];
                }

                
            }
        }

        if(dup == true) 
        {
            System.out.println("Duplicate found! First duplicated value: " + firstDup);
        } 
        else 
        {
            System.out.println("No duplicates found.");
        }
    }  
}
