
class matrix
{
public static void main(String args[])
{

int m[][] = new int[3][3];
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
m[i][j]=(int)Math.rint(10*Math.random());
}
}

System.out.println("The matrix is");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(m[i][j]+"   ");
}
System.out.println();
}
}
}