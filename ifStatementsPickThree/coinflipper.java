import java.util.Random;

class coinFlipper
{
    public static void main(String args[])
    {
        System.out.println("I flip coin");

        Random rand = new Random();
        int coinFlip = rand.nextInt(2);

        if (coinFlip == 1)
        {
            System.out.println("Heads"); 
        }
        else
        {
            System.out.println("Tails");
        }

    }
}