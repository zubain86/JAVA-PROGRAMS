/*WAP TO CREATE WATER IMAGE OF MATRIX*/
class forty_one
{
public static void main(String args[])
{
int i,j,k=0;
int m[][] = new int[5][5];
int n[][] = new int[5][5];
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
m[i][j] = (int)Math.rint(10*Math.random());
}
}
System.out.println("Matrix is-");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(m[i][j]+"  ");
}
System.out.println(" ");
}
for(i=4;i>=0;i--)
{
for(j=0;j<5;j++)
{
n[k][j] = m[i][j];
}
k++;
}
System.out.println("Water image");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(n[i][j]+"  ");
}
System.out.println(" ");
}}}

 
