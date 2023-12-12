import java.util.Scanner;

class arrayOfMax
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int index = 5;
        int currentBiggest = 0;
        int newestNum = 0;

        int[] array = new int[index];

        System.out.println("Enter 5 numbers to find the max");

       for(int i = 0; i < index; i++)
        {
            System.out.print("Enter number;");
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < 5; i++)
        {
            if(array[i] > currentBiggest)
            {
                currentBiggest = array[i];
            }
        }

        System.out.println(currentBiggest);
    }
}