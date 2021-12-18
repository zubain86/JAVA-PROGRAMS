import java.util.Scanner;
class spiral
{/*A pattern*/
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Welcome in the class of Zubain");
int i,j,n,k=1;
System.out.println("Enter the odd numbers of rows and columns");
n=sc.nextInt();
int m[][] = new int[n][n];
int r1=0,r2=n-1,c1=0,c2=n-1;
do
{
for(i=c1;i<=c2;i++)
{
m[r1][i]=k;
k++;
}
for(j=r1+1;j<=r2;j++)
{
m[j][c2]=k;
k++;
}
for(i=c2-1;i>=c1;i--)
{
m[r2][i]=k;
k++;
}
for(j=r2-1;j>=r1+1;j--)
{
m[j][c1]=k;
k++;
}
c1++;c2--;r1++;r2--;
}
while(k<=n*n);
System.out.println("The spiral is:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
System.out.println("THANK YOU FOR USING THE PROGRAM");
}
}






