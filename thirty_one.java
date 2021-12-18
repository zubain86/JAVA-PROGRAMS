/*WAP TO REMOVE MIDDLE NAME FROM THE GIVEN NAME*/
import java.util.Scanner;
class thirty_one
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String str;
System.out.println("Enter the string");
str = sc.nextLine();
int l = str.length();
int i,j;
String s1 = " ",s2 = " ";
for(i=0;i<l;i++)
{
char ch = str.charAt(i);
if(ch == ' ')
{
s1 = str.substring(0,i);
break;
}
}
for(j=l-1;j>0;j--)
{
char ch1 = str.charAt(j);
if(ch1 == ' ')
{
s2 = str.substring(j);
break;
}
}
String s = s1+s2;
System.out.println(s);
}
}