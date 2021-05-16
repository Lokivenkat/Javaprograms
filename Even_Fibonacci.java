import java.util.Scanner;
public class Even_Fibonacci
{
    public static void main(String args[]){
        int a=0,b=1,c,sum=0,num;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number:");
        num=input.nextInt();
        System.out.print(a+" "+b+" ");
        c=a+b;
        while(c<=num)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+" ");
            if(c%2==0)
                sum+=c;
        }
        System.out.print("\nSum is "+sum);
    }
}
