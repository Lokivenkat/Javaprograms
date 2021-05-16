import java.util.Scanner;
public class Buffer
{
    public static void main(String args[])
    {
        String str;
        int loc;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:");
        str = input.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.print("Enter the Location to delete a Character in a String:");
        loc = input.nextInt();
        sb.deleteCharAt(loc);
        System.out.println("The New String after deletion of a Character is "+sb);
    }
}
