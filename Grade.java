import java.util.Scanner;
interface InternalMarks
{
    void internalmarks();
}
interface ExternalMarks
{
    void externalmarks();
}
class Student implements InternalMarks, ExternalMarks
{
    int IMaths,ICPP,IChemistry,IEnglish,Itotal;
    int EMaths,ECPP,EChemistry,EEnglish,Etotal;
    Scanner sc = new Scanner(System.in);
    public void internalmarks()
    {
        System.out.print("Enter the Internal Marks of Maths:");
        IMaths = sc.nextInt();
        System.out.print("Enter the Internal Marks of C++:");
        ICPP = sc.nextInt();
        System.out.print("Enter the Internal Marks of Chemistry:");
        IChemistry = sc.nextInt();
        System.out.print("Enter the Internal Marks of English:");
        IEnglish = sc.nextInt();
    }
    public void externalmarks()
    {
        System.out.print("Enter the External Marks of Maths:");
        EMaths = sc.nextInt();
        System.out.print("Enter the External Marks of C++:");
        ECPP = sc.nextInt();
        System.out.print("Enter the External Marks of Chemistry:");
        EChemistry = sc.nextInt();
        System.out.print("Enter the External Marks of English:");
        EEnglish = sc.nextInt();
    }
    void display()
    {
        System.out.println("The Total Marks of Maths are "+(IMaths+EMaths));

        System.out.println("The Total Marks of C++ are "+(ICPP+ECPP));
        System.out.println("The Total Marks of Chemistry are "+(IChemistry+EChemistry));  System.out.println("The Total Marks of English are "+(IEnglish+EEnglish));
    }
}
public class Grade
{
    public static void main(String args[])
    {
        Student stu = new Student();
        stu.internalmarks();
        stu.externalmarks();
        stu.display();
    }
}
