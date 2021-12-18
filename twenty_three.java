/*WAP TO PRINT A GIVEN PATTERN B
                             B L
                             B L U
                             B L U E 
                             B L U E J*/
class twenty_three
{
public static void main(String args[])
{
String str = "BLUEJ";
int l = str.length();
int i,j;
for(i=0;i<5;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(str.charAt(j));
}
System.out.println();
}
}
}