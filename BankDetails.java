import java.util.Scanner;
class CustomerDetails
{
    int AccountNo;
    String CustomerName;
    String AccountType;
    double balance;
    Scanner sc = new Scanner(System.in);
    public void get_details()
    {
        System.out.print("Enter the Account Number:");
        AccountNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Name of the Customer:");
        CustomerName = sc.nextLine();
        System.out.print("Enter the Account Type:");
        AccountType = sc.next();
        System.out.print("Enter the Balance:");
        balance = sc.nextDouble();
    }
    public void display()
    {
        System.out.println("Account Number is "+AccountNo+"\n"+"Name of the Customer is "+CustomerName+"\n"+"Account Type is "+AccountType+"\n"+"Balance in the Customers Account is "+balance);
    }
}
class TransactionDetails extends CustomerDetails
{
    int amount,depo;
    Scanner input = new Scanner(System.in);
    public void withdraw()
    {
        System.out.print("Enter the Amount to With Draw:");
        amount = input.nextInt();
        if((balance-amount)<500)
        {
            System.out.println("Minimum Amount is Required");
        }

        else
        {
            balance-=amount;
            System.out.println("Available Balance after With Drawn is "+balance);
        }
    }
    public void deposit()
    {
        System.out.print("Enter the Amount to Deposit:");
        depo = input.nextInt();
        balance+=depo;
        System.out.println("Available Balance after Deposited is "+balance);
    }
}
public class BankDetails extends TransactionDetails
{
    public static void main(String args[])
    {
        char ch;
        Scanner inp = new Scanner(System.in);
        BankDetails bk = new BankDetails();
        bk.get_details();
        bk.display();
        System.out.println("1.With Drawl");
        System.out.println("2.Deposit");
        System.out.print("Enter Your Choice:");
        ch = inp.next().charAt(0);
        switch (ch)
        {
            case 'w': bk.withdraw();
                      break;
            case 'd': bk.deposit();
                      break;
            default: System.out.println("Invalid Choice");
        }
    }
}




