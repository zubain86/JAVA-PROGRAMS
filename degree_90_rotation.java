import java.util.*;
public class degree_90_rotation
{
    static int check(int arr[][], int t[][])
    {
        int i,j,k,temp,flag = 0;
        int p=1,q=1;
        int n = arr.length;
        for(i=1;i<=4;i++)
        {
            flag = 0;
            for(j=0;j<n;j++)
            {
                for(k=0;k<j;k++)
                {
                    temp = arr[j][k];
                    arr[j][k] = arr[k][j];
                    arr[k][j] = temp;
                }
            }//transpose loop
            System.out.println(p++ +" transposed matrix");
            for(j=0;j<n;j++)
            {
                for(k=0;k<n;k++)
                {
                    System.out.print(arr[j][k]+"\t");
                }
                System.out.println("");
            }//Prints transpose of a matrix
            for(j=0;j<n/2;j++)
            {
                for(k=0;k<n;k++)
                {
                   temp = arr[j][k];
                   arr[j][k] = arr[n-j-1][k];
                   arr[n-j-1][k] = temp;
                }
            }//Shifting loop
            System.out.println(q++ +" rotated matrix");
            for(j=0;j<n;j++)
            {
                for(k=0;k<n;k++)
                {
                    System.out.print(arr[j][k]+"\t");
                }
                System.out.println("");
            }//Prints rotated matrix
            for(j=0;j<n;j++)
            {
                for(k=0;k<n;k++)
                {
                   if(arr[j][k]!= t[j][k])
                   {
                       flag = 1;
                       break;
                   }
                }
            }//Checks rotated matrix
            if(flag==0) {
                break;
            }//Breaks the loop
        }
        if(flag==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n = sc.nextInt();
        int m[][] = new int[n][n];
        int t[][] = new int[n][n];
        System.out.println("Enter the first matrix");
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                t[i][j] = sc.nextInt();
            }
        }
        System.out.println("First matrix is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Second matrix is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(t[i][j]+"\t");
            }
            System.out.println("");
        }
        int k =	check(m,t);
        if(k==1)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}
