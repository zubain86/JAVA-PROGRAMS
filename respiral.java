import java.util.Scanner;
class respiral
{
/*This program is of spiral in reverse order*/
public static void main(String args[])
{
System.out.println("Welcome in the class of Zubain");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the odd number of rows and columns");
int n=sc.nextInt();
int i,j,k=n*n;
int m[][] = new int[n][n];
int r1=0,r2=n-1,c1=0,c2=n-1;
do
{
for(i=c2;i>=c1;i--)
{
m[r1][i]=k;
k--;
}
for(j=r1+1;j<=r2;j++)
{
m[j][c1]=k;
k--;
}
for(i=c1+1;i<=c2;i++)
{
m[r2][i]=k;
k--;
}
for(j=r2-1;j>=r1+1;j--)
{
m[j][c2]=k;
k--;
}
c1++;c2--;r1++;r2--;
}
while(k>=1);
System.out.println("The Spiral in reverse order is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
System.out.println("THANKYOU FOR USING THE PROGRAM");
}
}

