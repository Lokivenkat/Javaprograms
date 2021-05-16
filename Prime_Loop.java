import java.util.Scanner;
public class Prime_Loop
{
    public static void main(String args[])
    {
        int num,i,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Range:");
        num = input.nextInt();
        for(i=1;i<=num;i++)
        {
            int flag=0;
            for(j=1;j<=num;j++)
            {
                if(i%j==0)
                    flag++;
            }
            if(flag==2)
                System.out.println(i+" is a Prime Number");
        }
    }
}


