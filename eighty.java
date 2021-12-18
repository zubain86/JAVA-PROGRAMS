/*WAP TO PRINT FREQUENCY OF EACH NUMBER IN SDA*/
class eighty
{
public static void main(String args[])
{
int m[] = new int[10];
int i,j,r,f=0,ff=0;
for(i=0;i<10;i++)
{
m[i] = (int)Math.rint(10*Math.random());
}
System.out.println("The array is");
for(i=0;i<10;i++)
{
System.out.print(m[i]+"\t");
}
for(i=0;i<10;i++)
{
for(r=0;r<i;r++)
{
if(m[r]==m[i])
{
f=-1;
break;
}}
if(f==0)
{
for(j=0;j<10;j++)
{
if(m[j]==m[i])
{
ff++;
}
}
System.out.println("The frequency of number"+m[i]+"is"+ff);
}
f=0;
ff=0;
}
}
}
