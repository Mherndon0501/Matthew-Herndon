import java.util.Scanner;

class triangle
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of triangle is yours? Enter 3 values as below");
        System.out.println("(Only enter a number, no signs, no words, ONLY NUMBERS)");
        System.out.println("One very important note, if you have 2 or 3 of the same angles");
        System.out.println("Please enter them one after the other.");

        System.out.println("Angle 1 (Enter smallest angle first, one at a time):");
        int num1 = scanner.nextInt();

        System.out.println("Angle 2:");
        int num2 = scanner.nextInt();

        System.out.println("Angle 3:");
        int num3= scanner.nextInt();


        if (num1 * 3 == 180 && num1 + num2 + num3 == 180)
        {
            System.out.println("You have a equilateral triangle!");
        }
        else if (num1 * 2 + num3 == 180 && num1 + num2 + num3 == 180)
        {
            System.out.println("You have an isosceles triangle!"); 
        }
        else if (num1 + num2 + num3 == 180)
        {
            System.out.println("You have a scalene triangle!");
        }
        else
        {
            System.out.println("No triangles?");
            System.out.println("⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠠⡐⢠⠂⡔⠰⣀⠆⡠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⢠⠀⡂⠔⡠⢂⠢⡐⠄⡂⢀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⣿⣿⣿⠏⠀⠀⠀⠀⡀⢂⠔⡐⢄⠊⡔⢡⠢⡘⠠⢁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⢃⠐⠠⢁⠐⠠⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⣿⡿⣏⠀⠀⠄⢂⠡⠐⡈⠔⡈⢆⠱⣈⣶⣷⡡⢗⡆⣖⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⡀⠄⠠⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⣿⡟⡧⠀⠌⡐⣀⠂⣥⣐⡼⣶⣾⣷⣿⣿⣿⡧⢋⣧⢻⣦⣀⠀⠀⠀⠀⠀⠀⠠⠀⢀⠀⡐⠀⢁⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⣿⣿⣶⣯⣶⡵⣞⣷⣷⣯⣿⣿⣿⣿⣿⣿⠏⡔⠡⢻⠒⣿⣿⣦⡀⡀⠀⠀⠀⢀⠐⠠⠀⠄⠈⡀⢀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡟⠓⡌⠄⡑⢂⠥⠘⠿⣿⣿⣷⣤⣔⡈⣀⡀⢂⠌⡐⢀⠠⢀⠈⡀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⡿⢿⠛⢯⡙⡑⢒⠈⡡⠐⢂⠐⠌⣂⠡⢒⠈⠻⣿⣿⣿⣾⣷⣟⣶⣲⣴⣮⣶⣥⣞⣴⣳⣶⣠⢂⠄⣈⠐⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀");
            System.out.println("⣿⣿⣿⣿⣿⣿⠭⡘⠤⡉⢆⠰⠡⢌⠂⠥⡘⠠⢈⡐⠄⠢⡉⢌⡐⢈⠹⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⢐⠁⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⢀");
            System.out.println("⣿⣿⣿⣿⣿⣿⣇⢇⡄⢣⠘⡄⢣⠘⡸⢀⠣⡘⡀⠠⡘⠃⣠⠄⡸⢀⠃⡄⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣄⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡘⠀⠀⠀⢀⣼");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣷⣴⠂⣇⠜⡠⢃⢆⡉⢆⠱⡈⢅⠰⠁⠠⢚⡔⢡⠊⡄⢡⠂⠤⡉⢍⠛⡛⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⢠⠀⠀⠀⠀⠀⠀⠀⠀⢀⠘⡀⠃⢀⣴⣿⡿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣮⡂⢉⣖⣶⣱⣎⢦⡱⢌⣒⠀⡁⢢⠘⡆⠱⣈⠆⡉⢆⠱⡈⢆⠱⢌⠣⡐⢌⡩⠻⢿⣿⣿⣿⣿⣿⣿⡾⠄⠀⠀⠀⠀⠀⠀⠀⡌⢂⢄⣴⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⡿⣿⣿⣶⣿⣧⢎⡇⢀⠣⣉⠆⡓⡔⣊⠕⣪⢱⡘⢆⡣⢎⡒⠥⠒⡄⠓⡌⠜⣩⠛⣿⣿⣿⣿⠂⠀⠀⠀⠀⠀⠠⣉⣴⣾⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⣼⣿⣿⣿⣿⣷⡄⠂⡱⢌⢎⡱⣘⣦⣫⢶⣣⣟⡼⣵⡳⣜⣧⣙⠤⢓⢨⠘⡄⢣⡐⢩⢿⣿⡅⠀⠀⠀⠀⠀⢲⣾⣿⡿⠿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢠⣼⣿⣿⡟⠙⣿⡧⢀⠱⣊⠶⣹⢏⣿⣾⣿⣿⣿⣿⣿⣿⣿⣷⣯⣟⣎⢆⠣⡜⡠⠜⣠⢊⢏⡇⠀⠂⠀⠀⣠⣿⡟⠋⣀⣤⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡅⠀⣸⣿⣿⣿⣿⣿⣿⡗⡀⢣⢜⠲⣟⣿⣿⣿⠟⠉⣠⣽⣿⣿⣿⣿⣿⣿⣿⣮⣗⢬⡑⢎⡴⢩⢺⠀⠀⠀⣴⣾⣿⣏⣷⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠙⣿⣦⣌⣻⣿⣿⣿⣿⣿⠇⢐⣻⣎⡕⣫⢿⣿⡏⠀⢀⣽⣿⣿⡿⢻⣿⣿⣿⣿⣿⣿⢦⡙⣎⠶⡙⠸⠀⠀⣼⣿⣿⢋⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠀⠼⣯⣟⣿⣿⣿⣿⡿⠏⠀⢚⡶⡏⣿⣹⣿⣿⠀⠀⢨⣿⣿⣿⣧⣴⣿⣿⣿⠍⣿⣿⠇⠐⠈⠀⠁⠀⠀⢴⣿⣟⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠐⢊⠫⡙⠋⠭⠩⠀⠀⢀⣬⠷⡏⣷⣟⣻⣿⣇⠠⠀⢿⣿⡿⣿⣿⣿⣿⠏⢀⣸⡿⠁⠀⠀⠀⠀⠀⡼⣘⢳⣬⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢀⠀⢠⠆⠀⠀⠀⠀⠀⣴⢻⡮⠽⡼⣿⣼⢷⣿⣿⢷⣦⣌⣛⣿⣾⣿⣿⣯⡶⣿⠟⠀⠀⠀⠀⠀⠀⠈⣱⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣏⠂⢅⡢⠔⠀⠀⢀⠸⣔⡿⣍⢷⠳⠿⣿⡿⣿⢿⣿⣽⣛⣿⢻⣻⣝⣻⣴⡣⠆⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣟⢸⠾⠁⠀⠀⠀⠤⡙⣌⠻⣌⢎⡱⠛⣵⡑⢎⠣⣍⢛⡛⠷⣛⠻⣩⠉⡁⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠅⠀⠀⠀⠀⠐⠢⡑⠌⠱⢌⠒⠬⡙⢌⠗⡌⠱⡀⢆⡉⢖⡠⠣⣄⠱⣀⠆⡠⢀⠀⠀⠀⢰⣿⣿⣿⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⠃⠀⠀⠀⠀⠀⠁⠀⠀⠈⠀⠀⠈⠂⠍⢂⡚⠬⣑⠸⢄⡍⠲⣌⡱⢦⣹⠰⡘⡤⢃⡼⠸⢡⣿⣿⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣯⡿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠈⣵⢪⠜⡢⢜⡱⢢⡓⣾⣩⠧⢅⢃⡁⠠⢢⣿⡀⠙⣿⣾⡿⣯⢷⣻⣟⣿⣿⣿⣿⣿⡏⣸⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣼⡍⡞⢱⡎⣴⢣⠙⣮⣽⣮⢠⡌⠑⢢⣾⣿⡟⣶⣶⣭⢻⣭⡟⣷⣯⣿⣿⣿⣿⣿⢱⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⢧⡛⣜⢣⢜⠢⢎⡱⠢⠅⠂⡰⠁⠀⣼⣿⣿⣷⣾⣿⣿⣮⣟⣽⣳⢯⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⡿⡩⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠞⡱⢎⡝⣎⢧⢊⡕⢪⠔⠡⠈⠀⠁⠈⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣿⣿⣻⣿⣷⣿⣾⣽⣯⢿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣟⣂⢀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠂⠉⠁⡊⠑⢪⣼⢚⡬⢣⠜⡱⠈⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⢯⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣷⢈⢢⡀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠒⠁⠀⠀⠀⠀⠀⠉⠈⢺⣍⡞⡥⢚⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣯⣷⠵⡤⡕⢀⣠⣤⡴⣊⡈⣀⠀⠀⠀⢀⠀⠀⠀⠀⠈⢡⢜⡷⡍⢆⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣏⣿⣵⡿⡿⡿⢿⠹⠵⠊⠒⠻⠾⣶⣄⡀⠂⠹⣟⣧⠂⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢎⣿⣿⣿⣿⣿⣛⡯⣥⣂⣀⡄⠀⡈⠉⢿⣄⠈⣿⣞⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣣⣞⣿⣿⣿⣿⣿⣳⣝⣶⣋⣶⣩⣍⣒⣀⣈⣹⣳⣍⣂⣀⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");



        }

    }
}