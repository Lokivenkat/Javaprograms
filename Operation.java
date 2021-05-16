package demo;
public class Operation
{
    public void armstrong(int num)
    {
        int rem,res=0,temp;
        temp = num;
        while(num!=0)
        {
            rem = num%10;
            res = (rem*rem*rem)+res;
            num = num%10;
        }
        if(temp==res)
        {
            System.out.println(res+" is an Armstrong Number");
        }
        else
        {
            System.out.println(res+" is not an Armstrong Number");
        }
    }
}

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
