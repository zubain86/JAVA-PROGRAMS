/*WAP TO PRINT MIRROR IMAGE*/
class forty_three
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
System.out.println();
}
System.out.println("Mirror image");
for(i=0;i<5;i++)
{
for(j=4;j>=0;j--)
{
n[i][k] = m[i][j];
k++;
}
k=0;
}
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(n[i][j]+"  ");
}
System.out.println(" ");
}
}
}