/*WAP TO PRINT THE ADDITION OF TWO MATRICES*/
class forty
{
public static void main(String args[])
{
int i,j;
int m[][] = new int[5][5];
int n[][] = new int[5][5];
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
m[i][j] = (int)Math.rint(10*Math.random());
}
}
System.out.println("Matrix A is-");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
n[i][j] = (int)Math.rint(10*Math.random());
}
}
System.out.println("Matrix B-");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(n[i][j]+"\t");
}
System.out.println();
}
int c[][] = new int[5][5];
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
c[i][j] = m[i][j] + n[i][j];
}
}
System.out.println("New matrix");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}
}