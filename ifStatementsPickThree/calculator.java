import java.util.Scanner;

class calculator
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Matthew's calculator!");
        System.out.println("This is the most advance calculator on this planet! (2000 years ago)");
        System.out.println("You can choose 4 operators, here are the choices,");
        System.out.println("+ - / *");
        System.out.println("And you can pick 2 of any integer! (no decimal points)");

        System.out.println("Pick your operator:");
        char opp = scanner.next().charAt(0);

        System.out.println("Number 1:");
        int num1 = scanner.nextInt();

        System.out.println("Number 2:");
        int num2 = scanner.nextInt();

        if (opp == 43)
        {
            System.out.println("You picked to add,");
            System.out.println(num1 + num2);
        }
        else if (opp == 45)
        {
            System.out.println("You picked to subtract,"); 
            System.out.println(num1 - num2);
        }
        else if (opp == 47)
        {
            System.out.println("You picked to divide,");
            System.out.println(num1 / num2);
        }
        else if (opp == 42)
        {
            System.out.println("You picked to multiply,");
            System.out.println(num1 * num2);
        }
        else
        {
            System.out.println("You messed up");
        }

    }
}