/*WAP TO CHECK FOR SYMMETRIC MATRIX*/
class forty_five
{
public static void main(String args[])
{
int m[][] = new int[5][5];
int n[][] = new int[5][5];
int i,j,f=0;
System.out.println("Enter the matrix");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
m[i][j] = (int)Math.rint(10*Math.random());
}
}
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
n[j][i] = m[i][j];
}
}
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println("   ");
}
System.out.println("Enter the next matrix");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(n[i][j]+"\t");
}
System.out.println(" ");
}
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
if(m[i][j] != n[i][j])
{
f=1;
break;
}
}}
if(f==1)
{
System.out.println("Not a symmetric");
}
else
{
System.out.println("Symmetric");
}
}
}
