import java.util.Scanner;

class addArray
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int index = 3;

        int[] array = new int[index];

        System.out.println("Add 3 numbers");

        for(int i = 0; i < index; i++)
        {
            System.out.print("Enter number;");
            array[i] = scanner.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        System.out.println(sum);
    }
}