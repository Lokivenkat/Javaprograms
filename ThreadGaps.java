class First extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=3;i++)
				System.out.println("Good Morning");
				Thread.sleep(1000);
		}
		catch(InterruptedException ie){	System.out.println(ie);	}
	}
}
class Second extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=3;i++)
				System.out.println("Hello");
				Thread.sleep(2000);
		}
		catch(InterruptedException ie){	System.out.println(ie);	}
	}

}
class Third extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=3;i++)
				System.out.println("Welcome");
				Thread.sleep(3000);
		}
		catch(InterruptedException ie){	System.out.println(ie);	}
	}
}
public class ThreadGaps
{
	public static void main(String args[])
	{
		First f1 = new First();
		Second s2 = new Second();
		Third t3 = new Third();
		f1.start();
		s2.start();
		t3.start();
	}
}

