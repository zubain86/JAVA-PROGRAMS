/*WAP TO PRINT ALL ANAGRAM OF A STRING GIVEN THAT LENGTH OF A STRING IS THREE*/
class seventy_six
{
public static void main(String args[])
{
String s ="OWL";
int l = s.length();
int i,j,k;
for(i=0;i<l;i++)
{
for(j=0;j<l;j++)
{
for(k=0;k<l;k++)
{
if(i!=j&&j!=k&&k!=i)
{
System.out.print(s.charAt(i)+""+s.charAt(j)+""+s.charAt(k)+"\t");
}
}
}
}
}
}