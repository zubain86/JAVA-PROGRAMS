import java.util.Scanner;
class sum
{/*this program adds the elements of rows and columns*/
public static void main(String args[])
{
System.out.println("Welcome in the class of Zubain");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
int n = sc.nextInt();
System.out.println("Enter the number of columns");
int m = sc.nextInt();
int a[][] = new int[n+1][m+1];
int i,j,s=0,s1=0;
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j] = (int)Math.rint(10*Math.random());
}
}
System.out.println("The array is:");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
s = s+a[i][j];
}
a[i][m] = s;
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
s1 = s1+a[j][i];
}
a[n][i] = s1;
}
System.out.println("THE REQUIRED MATRIX");
for(i=0;i<n+1;i++)
{
for(j=0;j<m+1;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("THANKYOU FOR USING THIS PROGRAM");
}
}