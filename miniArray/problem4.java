import java.util.Scanner;

class arrayOfSmall
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int index = 5;
        int currentSmallest = 100000000;
        int newestNum = 0;

        int[] array = new int[index];

        System.out.println("Enter 5 numbers to find the smallest");

       for(int i = 0; i < index; i++)
        {
            System.out.print("Enter number;");
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < 5; i++)
        {
            if(array[i] < currentSmallest)
            {
                currentSmallest = array[i];
            }
        }

        System.out.println(currentSmallest);
    }
}