import java.util.Scanner;
class arrange
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string in upper case");
String s = sc.nextLine();
char ch,ch1;
int i;
String w = "";
for(ch='A';ch<='Z';ch++)
{
for(i=0;i<s.length();i++)
{
ch1 = s.charAt(i);
if(ch1==ch)
{
w = w+ch;
}
}}
System.out.println("String in alphabetical order is"+w);
}
}