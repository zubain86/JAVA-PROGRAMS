import java.util.Scanner;
class mirrorimage
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
int m = sc.nextInt();
System.out.println("Enter the number of columns");
int n = sc.nextInt();
int arr[][] = new int[m][n];
System.out.println("The array is");
int i,j;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr[i][j] = sc.nextInt();
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
int arr1[][] = new int[m][n];
int p = 0,q=n-1;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr1[i][j] = arr[p][q];
q--;
}
p++;
q=n-1;
}
System.out.println("The mirror image is");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(arr1[i][j]+"\t");
}
System.out.println();
}
System.out.println("Corner elements are");
System.out.print(arr1[0][0]+"\t"+arr1[0][n-1]+"\t"+arr1[m-1][0]+"\t"+arr1[m-1][n-1]);
}
}