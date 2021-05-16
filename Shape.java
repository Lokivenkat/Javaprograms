import java.util.Scanner;
abstract class Shapes
{
    abstract void Triangle(int b,int h);
    abstract void Rectangle(int l,int b);
    abstract void Square(int s);
    abstract void Circle(int r);
}
class Area1 extends Shapes
{
    void Triangle(int b,int h)
    {
        System.out.println("Area of Triangle is "+(0.5*b*h));
    }
    void Rectangle(int l,int b)
    {
        System.out.println("Area of Rectangle is "+(l*b));
    }
    void Square(int s)
    {
        System.out.println("Area of Square is "+(s*s));
    }
    void Circle(int r)
    {
        System.out.println("Area of Circle is "+(3.14*r*r));
    }
}
public class Shape
{
    public static void main(String args[])
    {
        int length,breadth,side,base,height,radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base of Triangle:");
        base = sc.nextInt();
        System.out.print("Enter the Height of Triangle:");
        height = sc.nextInt();
        Area1 tri = new Area1();
        tri.Triangle(base,height);
        System.out.print("Enter the Length of Rectangle:");

        length = sc.nextInt();
        System.out.print("Enter the Breadth of Rectangle:");
        breadth = sc.nextInt();
        Area1 rec = new Area1();
        rec.Rectangle(length,breadth);
        System.out.print("Enter the Side of Square:");
        side = sc.nextInt();
        Area1 sq = new Area1();
        sq.Square(side);
        System.out.print("Enter the Radius of Circle:");
        radius = sc.nextInt();
        Area1 cir = new Area1();
        cir.Circle(radius);
    }
}
