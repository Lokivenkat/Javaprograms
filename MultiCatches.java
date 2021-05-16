public class MultiCatches
{
	public static void main(String args[])
	{
		try
		{
			int a=10,b=0;
			int arr[] = new int[5];
			arr[6]=10;
			System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println(ab);
		}
 	}
}
