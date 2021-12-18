/*WAP TO CHECK A DIAGONAL MATRIX.A DIAGONAL MATRIX IS ONE WHOSE NON DIAGONAL ELEMENTS ARE ZERO*/
class fifty_seven
{
public static void main(String args[])
{
int i,j,f=0;
int m[][] = new int [3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
m[i][j] = (int)Math.rint(10*Math.random());
}
}
System.out.println("The matrix is");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println("");
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if((i!=j)&&m[i][j]!=0)
{
f=-1;
break;
}
}}
if(f==-1)
{
System.out.println("NOT A DIAGONAL MATRIX");
}
else
{
System.out.println("DIAGONAL");
}
}
}