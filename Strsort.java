import java.util.Scanner;
public class Strsort
{
    public static void main(String args[])
    {
        int i,n,j;
        String temp;
        Scanner input = new Scanner(System.in);
        String names[] = new String[20];
        System.out.print("Enter the Size:");
        n = input.nextInt();
        System.out.println("Enter Names/Words: ");
        for(i=0;i<n;i++)
            names[i] = input.next();
        System.out.println("Sorting Words/Names in Alphabetical Order...");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Names in Sorted Order: ");
        for(i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }
}

