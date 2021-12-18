/*MATRIX MULTIPLICATION*/
import java.util.Scanner;
class seventy_five
{/*This program does the product of two matrices*/
public static void main(String args[])
{
System.out.println("Welcome in the class of Zubain");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows and columns");
int m = sc.nextInt();
int a = sc.nextInt();
int b = sc.nextInt();
int n = sc.nextInt(); 
int m1[][] = new int[m][a];
int l[][] = new int[b][n];
if(a==b)
{
int o[][] = new int[m][n];
int i,j,k;
for(i=0;i<m;i++)
{
for(j=0;j<a;j++)
{
m1[i][j]=(int)Math.rint(10*Math.random());
}
}
for(i=0;i<b;i++)
{
for(j=0;j<n;j++)
{
l[i][j]=(int)Math.rint(10*Math.random());
}
}
System.out.println("The first matrix is:");
for(i=0;i<m;i++)
{
for(j=0;j<a;j++)
{
System.out.print(m1[i][j]+"\t");
}
System.out.println();
}
System.out.println("The second matrix is:");
for(i=0;i<b;i++)
{
for(j=0;j<n;j++)
{
System.out.print(l[i][j]+"\t");
}
System.out.println();
}
System.out.println("The product is:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
for(k=0;k<a;k++)
{
o[i][j] =o[i][j]+ m1[i][k]*l[k][j];
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
}}
else
{
System.out.println("Invalid outcome");
}
System.out.println("THANK YOU FRO USING THE PROGRAM");
}
}

 