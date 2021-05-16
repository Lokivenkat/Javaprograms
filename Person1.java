import java.util.Scanner;
class Person
{
    String name;
    String gender;
    int age;
    String occupation;
    String company;
    long salary;
    String experience;
    void Personal_data()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Name of the Person:");
        name=input.nextLine();
        System.out.print("Enter the Gender:");
        gender=input.next();
        System.out.print("Enter the Age of the Person:");
        age=input.nextInt();
    }
    void Qualification_data()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Designation of the Person:");
        occupation=sc.nextLine();
        System.out.print("Enter the Company:");
        company=sc.next();
        System.out.print("Enter the Salary:");
        salary=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the Experience of the Person:");
        experience=sc.nextLine();
    }
    void display()
    {
        System.out.println("Name of the Person is "+name);
        System.out.println("Age of the Person is "+age);
        System.out.println("Gender of the Person is "+gender);
        System.out.println("Designation of the Person is "+occupation);
        System.out.println("Company worked at "+company);

System.out.println("Experience of the Person is "+experience);        System.out.println("Salary given is "+salary);
    }
}
public class Person1
{
    public static void main(String args[])
    {
        Person p = new Person();
        p.Personal_data();
        p.Qualification_data();
        p.display();
    }
}
