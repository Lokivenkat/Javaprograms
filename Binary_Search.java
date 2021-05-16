import java.util.Scanner;
public class Binary_Search
{
    public static void main(String args[])
    {
        int mid,key,first,last,i,num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the Elements in an Array: ");
        for(i=0;i<num;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the Key to Search in an Array: ");
        key = sc.nextInt();
        first =0;
        last = num-1;
        while(first<=last)
        {
            mid = (first+last)/2;
            if(key<arr[mid])
            {
                last = mid-1;
            }
            else if(key==arr[mid])
            {
                System.out.println("The Element "+key+" is found");
                break;
            }
            else
            {
                first = mid+1;
            }
        }
    }
}
