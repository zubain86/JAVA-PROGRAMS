/*WAP TO PRINT ThE GIVEN STRING IN THE GIVEN FORMAT 
I = SUBHASH CHANDRA BOSE
O = S.C.BOSE*/
import java.util.Scanner;
class twenty_seven
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String str;
System.out.println("Enter the name");
str = sc.nextLine();
int l,pos=0,i;
l = str.length();
for(i=l-1;i>0;i--)
{
char ch = str.charAt(i);
if(ch == ' ')
{
pos = i;
break;
}
}
System.out.print(str.charAt(0)+".");
for(i=0;i<pos;i++)
{
char ch1 = str.charAt(i);
if(ch1 == ' ')
{
System.out.print(str.charAt(i+1)+".");
}
}
System.out.println(str.substring(pos+1));
}
}
