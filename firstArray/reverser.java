import java.util.Scanner;

class reverser
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int index;
        int temp;

        System.out.print("How many numbers? ");
        index = scanner.nextInt();

        int[] intArray = new int[index];

        for (int i = 0; i < index; i++) 
        {
            System.out.print("Put in a number ");
            intArray[i] = scanner.nextInt();
        }
        for (int i = 0, j = index - 1; i < index / 2; i++, j--)
        {
            temp = intArray[j];
            intArray[j] = intArray[i];
            intArray[i] = temp;
        }
        for (int i = 0; i < index; i++)
        {
            System.out.print(intArray[i]);
        }
    }
}