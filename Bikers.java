import java.util.Scanner;
public class Bikers
{
    public static void main(String args[])
    {
        double b1,b2,b3,b4,b5,average;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Speed of 1st Biker:");
        b1 = input.nextDouble();
        System.out.print("Enter the Speed of 2nd Biker:");
        b2 = input.nextDouble();
        System.out.print("Enter the Speed of 3rd Biker:");
        b3 = input.nextDouble();
        System.out.print("Enter the Speed of 4th Biker:");
        b4 = input.nextDouble();
        System.out.print("Enter the Speed of 5th Biker:");
        b5 = input.nextDouble();
        average = (b1+b2+b3+b4+b5)/5;
        if(b1>average)
            System.out.println("The 1st Biker is Qualified the race with "+b1+" Speed");
        if(b2>average)
            System.out.println("The 2nd Biker is Qualified the race with "+b2+" Speed");
        if(b3>average)
            System.out.println("The 3rd Biker is Qualified the race with "+b3+" Speed");
        if(b4>average)
            System.out.println("The 4th Biker is Qualified the race with "+b4+" Speed");
        if(b5>average)
            System.out.println("The 5th Biker is Qualified the race with "+b5+" Speed");

    }
}
