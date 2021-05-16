import java.util.Scanner;
class rectangle
{
    int length,breadth;
    rectangle(int len,int brea)
    {
        length=len;
        breadth=brea;
    }
    void show()
    {
        System.out.println("Area of Rectangle is "+(length*breadth));
    }
}
public class Constructor
{
    public static void main(String args[])
    {
        int l,b;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle:");
        l=input.nextInt();
        System.out.println("Enter the Breadth of the Rectangle:");
        b=input.nextInt();
        rectangle rec=new rectangle(l,b);
        rec.show();
    }
}

