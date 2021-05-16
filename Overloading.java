class Area
{
    void area(int r)
    {
        System.out.println("Area of the Circle is "+(3.14*r*r));
    }
    void area(int a,int b,int c,double s)
    {
        System.out.println("Area of the Triangle is "+(Math.sqrt(s*(s-a)*(s-b)*(s-c))));
    }
    void area()
    {
        int x=10;
        System.out.println("Area of the Square is "+(x*x));
    }
    void area(int a,int b)
    {
        System.out.println("Area of the Rectangle is "+(a*b));
    }
}
public class Overloading
{
    public static void main(String args[])
    {
        int radius=12,len=20,brea=30,side1=34,side2=21,side3=40;
        double avg=(side1+side2+side3)/3;
        Area a = new Area();
        a.area(radius);
        a.area(side1,side2,side3,avg);
        a.area();
        a.area(len,brea);
    }
}
