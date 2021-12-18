/*WAP TO REVERSE A GIVEN STRING*/
class twenty_six
{
public static void main(String args[])
{
String str = "BLUEJ";
int l = str.length();
String w = "  ";
int i;
for(i=l-1;i>=0;i--)
{
char ch = str.charAt(i);
w = w + ch;
}
System.out.println("Reversed string is"+w);
}
}
