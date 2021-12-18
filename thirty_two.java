/*WAP TO REMOVE DUPLICATE CHARACTERS FROM A GIVEN STRING (GIVEN DUPLICATE CHARACTERS ARE ADJACENT)
I jjaavvvvvaaa
O java*/
import java.util.Scanner;
class thirty_two
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s;
System.out.println("Enter the string");
s = sc.nextLine();
int l = s.length();
int i  ;      char rep = ' ';
for(i=0;i<l;i++)
{
char ch = s.charAt(i);
if(ch != rep)
{
System.out.print(ch);
}
rep  = ch;
}
}
}
