import java.util.Scanner;

class age3
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What year were you born?");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("Enter here:");
        int yearBorn = scanner.nextInt();

        int age = 2023 - yearBorn;

        System.out.println(age + " Is your age! (How are you so old?!?!)");
    }
}