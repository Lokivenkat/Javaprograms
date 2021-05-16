import java.util.Scanner;
public class Armstrong
{
    public static void main(String args[])
    {
        int rem,res=0,temp,num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number:");
        num = input.nextInt();
        temp = num;
        while(num!=0){
            rem = num%10;
            res = (rem*rem*rem)+res;
            num = num/10;
        }
        if(temp==res)
            System.out.println(res+" is an Armstrong Number");
        else
            System.out.println(res+" is not a Armstrong Number");
    }
}
