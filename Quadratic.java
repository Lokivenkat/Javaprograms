import java.util.Scanner;
public class Quadratic
{
    public static void main(String args[])
    {
        int num1,num2,num3;
        double res1,res2,dis;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        num1=input.nextInt();
        System.out.println("Enter the Second Number:");
        num2=input.nextInt();
        System.out.println("Enter the Third Number:");
        num3=input.nextInt();
        dis=num2*num2-4*num1*num3;
        if(dis>0)
        {
            res1=((-num2+Math.sqrt(dis))/(2*num1));
            res2=((-num2-Math.sqrt(dis))/(2*num1));
            System.out.println("Roots are Real and Distinct");
            System.out.println("Roots are "+res1+" and "+res2);
        }
        else if(dis==0)
        {
            res1=((-num2)/(2*num1));
            res2=((-num2)/(2*num1));
            System.out.println("Roots are Equal");
            System.out.println("Roots are "+res1+" and "+res2);
        }
        else
        {
            System.out.println("Roots are Imaginary");
        }
    }
}
