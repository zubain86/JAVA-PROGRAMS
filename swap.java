import java.util.Scanner;
class swap
{/*This program interchanges two rows or columns*/
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i,j;
System.out.println("Enter the number of rows and columns");
int n = sc.nextInt();
int m[][] = new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
m[i][j] = (int)Math.rint(10*Math.random());
}
}
System.out.println("The Array is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
for(j=0;j<n;j++)
{
int t = m[0][j];
m[0][j] = m[n-1][j];
m[n-1][j] = t;
}
System.out.println("The swapped array is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
System.out.println("THANK YOU FOR USING PROGRAM");
}
}
