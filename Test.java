
import demo.Operation;
import java.util.Scanner;
public class Test
{
    public static void main(String args[])
    {
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number:");        
        num = sc.nextInt();
        Operation op = new Operation();
        op.armstrong(num);
    }
}

