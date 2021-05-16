import java.util.Scanner;
public class MatrixOperations
{
    public static void main(String args[])
    {
        int m,n,p,q,i,j,ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows of Matrix 1: ");
        m = sc.nextInt();
        System.out.print("Enter the Number of Columns of Matrix 1: ");
        n = sc.nextInt();
        int arr1[][] = new int[m][n];
        System.out.print("Enter the Number of Rows of Matrix 2: ");
        p = sc.nextInt();r
        System.out.print("Enter the Number of Columns of Matrix 2: ");
        q = sc.nextInt();
        int arr2[][] = new int[p][q];
        int arr3[][] = new int[m][q];
        System.out.println("Enter the Elements of Matrix 1:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Elements of Matrix 2:");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Operations on Matrix");
        System.out.println("1.Addition");
        System.out.println("2.Multiplication");
        System.out.print("Enter Your Choice:");
        ch = sc.nextInt();

        switch (ch)
        {
               case 1: for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                        {
                            arr3[i][j] = arr1[i][j]+arr2[i][j];
                        }
                    }
                    System.out.println("The Addition of two Matrices is ");
                    for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                        {
                            System.out.print(arr3[i][j]+"\t");
                        }
                        System.out.print("\n");
                    }
                    break;
            case 2: for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                        {
                            arr3[i][j]=0;
                            for(int k=0;k<n;k++)
                            {
                                arr3[i][j] = arr3[i][j]+(arr1[i][k]*arr2[k][j]);
                            }
                        }
                    }
                    System.out.println("The Multiplication of two Matrices is ");
                    for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                        {
                            System.out.print(arr3[i][j]+"\t");
                        }
                        System.out.print("\n");
                    }
                    break;
        }
    }
}