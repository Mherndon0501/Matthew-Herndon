class discount5
{
 public static void main(String args[])
 {
     double price = 203.0;
     int savings = (int)(price / 100.0 * 20.0);
     System.out.println(price - savings  + " is your total. You saved " + savings + " Dollars!");
 }
}