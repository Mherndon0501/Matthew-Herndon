import java.util.Scanner;

class smallOrBig
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int numWanted = scanner.nextInt();

        int currentBiggest = 0;
        int currentSmallest = 1000000000;

        while (numWanted > 0) 
        {
            System.out.println("Enter your next number, you have " + numWanted + " left.");
            int newestNum = scanner.nextInt();
            numWanted--;

            if(currentBiggest < newestNum)
            {
                currentBiggest = newestNum;
            }
            if(currentSmallest >= newestNum)
            {
                currentSmallest = newestNum;
            }
        }
            System.out.println("The smallest number entered is: " + currentSmallest);
            System.out.println("The largest number entered is: " + currentBiggest);
    }
}
