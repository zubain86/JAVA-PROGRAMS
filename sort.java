import java.util.Scanner;
class sort
{/*This program sorts the array in rows*/
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows and columns");
int n = sc.nextInt();
int m[][] = new int[n][n];
int i,j,k,t;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
m[i][j] = (int)Math.rint(10*Math.random());
}
}
System.out.println("The array is:");
 for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-1;j++)
{
for(k=0;k<n-1-j;k++)
{
if(m[i][k]>m[i][k+1])
{
t=m[i][k];
m[i][k]=m[i][k+1];
m[i][k+1]=t;
}}}}
System.out.println("The sorted array is:");
 for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
System.out.println("THANK YOU");
}
}
