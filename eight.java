/*WAP TO PRINT A GIVEN PATTERN 1
                               1 0
                               1 0 1
                               1 0 1 0
                               1 0 1 0 1*/
class eight
{
public static void main(String args[])
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
if(j%2==0)
{
System.out.print(0);
}
else
{
System.out.print(1);
}
}
System.out.println(" ");
}
}
}
