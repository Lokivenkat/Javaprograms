import java.util.Scanner;
class AgeException extends Exception
{
	AgeException(String msg)
	{
		super(msg);
	}
}
public class UserException
{
	public static void main(String args[])
	{
		try
		{
			int age;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Age:");
			age = sc.nextInt();
			if(age<18)
				throw new AgeException("Verify Your Age to be verified to Vote");
			else
				System.out.println("He is Eligible to Vote.");
		}


		catch(AgeException ae)
		{
			System.out.println(ae);
		}
	}
}
