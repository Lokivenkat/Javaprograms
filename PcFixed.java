class Q
{
	int n;
	boolean valueSet = false;
	synchronized int get()
	{
		while(!valueSet)
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("InterruptedException caught");
			}
			System.out.println("Got: " + n);
			valueSet = false;
			notify();
			return n;
	}
	synchronized void put(int n)
	{
		while(valueSet)
			try
			{

				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("InterruptedException caught");
			}
			this.n = n;
			valueSet = true;
			System.out.println("Put: " + n);
			notify();
	}
}
class Producer extends Thread
{
	Q q;
	Producer(Q q)
	{
		this.q = q;
	}
	public void run()
	{
		int i = 0;
		while(true)
		{
			q.put(i++);
		}

	}
}
class Consumer extends Thread
{
	Q q;
	Consumer(Q q)
	{
		this.q = q;
	}
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
public class PcFixed
{
	public static void main(String args[])
	{
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();
		System.out.println("Press Control-C to stop.");

	}
}
