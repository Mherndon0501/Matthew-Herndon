import java.util.Scanner;

class odds
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int index = 5;

        int[] array = new int[index];

        System.out.println("Enter 5 numbers");

        for(int i = 0; i < index; i++)
        {
            System.out.print("Enter number;");
            array[i] = scanner.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < 5; i++)
        {
            if(array[i] % 2 == 0)
            {
            System.out.println(array[i]); 
            }
        }

    }
}