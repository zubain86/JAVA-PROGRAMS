/*WAP TO CHECK ANAGRAM STRING
FLOW - WOLF*/
import java.util.Scanner;
class fifty_three
{
static String arrange(String s)
{
char ch;int j;String w = "";
for(ch='A';ch<='Z';ch++)
{
for(j=0;j<s.length();j++)
{
if(ch == s.charAt(j))
{
w = w+ch;
}
}}
System.out.println(w);
return(w);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two strings");
String s1 = sc.nextLine();
String s2 = sc.nextLine();
String a1 = arrange(s1);
String a2 = arrange(s2);
if(a1.equals(a2))
{
System.out.println("ANAGRAM");
}
else
{
System.out.println("NOT AN ANAGRAM");
}
}}