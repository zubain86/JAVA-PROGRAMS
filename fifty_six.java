/*WAP TO CHECK FOR A SCALAR MATRIX.A SCLAR MATRIX IS ONE WHOSE DIAGONAL ELEMENTS ARE NON ZERO AND EQUAL AND NON DIAGONAL ELEMENTS ARE ZERO*/
class fifty_six
{
public static void main(String args[])
{
int i,j;
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
int e = m[0][0],f=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(((i==j)&& m[i][j]!=e)||((i==j)&&m[i][j]==0))
{
f=-1;break;
}
if((i!=j)|| m[i][j]!=0)
{
f=-1;
break;
}
}
if(f==-1)
{
System.out.println("NOT A SCALAR");
}
else
{
System.out.println("SCALAR");
}
}
}
}