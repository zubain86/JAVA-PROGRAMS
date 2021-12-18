import java.util.Scanner;
public class A_multiplication_B {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        int i,j;
        System.out.println("Enter the elements of first matrix:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The first matrix is");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
     System.out.println("Enter the number of rows and columns in second matrix");
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    int b[][] = new int[r2][c2];
        System.out.println("Enter the elements of second matrix:");
        for(i=0;i<r2;i++)
    {
        for(j=0;j<c2;j++)
        {
            b[i][j] = sc.nextInt();
        }
    }
        System.out.println("The second matrix is");
        for(i=0;i<r2;i++)
    {
        for(j=0;j<c2;j++)
        {
            System.out.print(b[i][j]+"\t");
        }
        System.out.println("");
    }
        if(c1==r2)
        {
            int k,sum = 0,p=0,q=0;
            int arr[][] = new int[r1][c2];
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++) {
                    for (k = 0; k < c1; k++) {
                        sum = sum + a[i][k] * b[k][j];
                    }
                    arr[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("Matrix after multiplication is:");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println("");
            }
        }
      else
        {
            System.out.println("Invalid Input");
        }
    }

}
