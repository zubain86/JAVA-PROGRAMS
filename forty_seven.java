/*WAP TO PRINT A GIVEN PATTERN          J
                                      E E
                                    U U U
                                  L L L L
                                B B B B B */
class forty_seven
{
public static void main(String args[])
{
int i,j,k;
String s = "BLUEJ";
for(i=4;i>=0;i--)
{
for(j=0;j<=i;j++)
{
System.out.print("\t");
}
for(k=i+1;k<=5;k++)
{
System.out.print(s.charAt(i)+"\t");
}
System.out.println(" ");
}
}
}
