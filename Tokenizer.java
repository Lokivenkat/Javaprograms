import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenizer
{
    public static void main(String args[])
    {
        String str;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String:");
        str = input.nextLine();
        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
            count++;
        }
        System.out.print("The Number of Tokens in a String are "+count);
    }
}
