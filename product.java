import java.util.Scanner;
class product
{/*This program does the product of two matrices*/
public static void main(String args[])
{
System.out.println("Welcome in the class of Zubain");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows and columns");
int n = sc.nextInt(); 
int m[][] = new int[n][n];
int l[][] = new int[n][n];
int o[][] = new int[n][n];
int i,j,k;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
m[i][j]=(int)Math.rint(10*Math.random());
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
l[i][j]=(int)Math.rint(10*Math.random());
}
}
System.out.println("The first matrix is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
System.out.println("The second matrix is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(l[i][j]+"\t");
}
System.out.println();
}
System.out.println("The product is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
for(k=0;k<n;k++)
{
o[i][j] =o[i][j]+ m[i][k]*l[k][j];
}
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(o[i][j]+"\t");
}
System.out.println();
}
System.out.println("THANK YOU FOR USING THE PROGRAM");
}}

 