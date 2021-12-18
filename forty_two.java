/*WAP TO PRINT CORNER ELEMENT OF GIVEN MATRIX.*/
class forty_two
{
public static void main(String args[])
{
int i,j;
int m[][] = new int[5][5];
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
System.out.println("The corner elements are");
System.out.println(m[0][0]+","+m[0][4]+","+m[4][0]+","+m[4][4]);
}
}