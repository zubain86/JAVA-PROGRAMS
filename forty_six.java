/*WAP TO PICK OUT FIRST CHARACTER OF EACH STRING IN GIVEN STRING ARRAY. MAKE THE ARRAY ALPHABETICALY SORTED*/
import java.util.Scanner;
class forty_six
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s[] = new String[5];
System.out.println("Enter the string in array");
int i,j;
for(i=0;i<5;i++)
{
s[i] = sc.nextLine();
}
for(i=0;i<5;i++)
{
System.out.print(s[i]+"\t");
}
System.out.println(" ");
String s1 =  "  ",w = "";
for(i=0;i<5;i++)
{
s1 = s1+s[i].charAt(0);
}
char ch;
for(ch='A';ch<='Z';ch++)
{
for(j=0;j<s1.length();j++)
{
if(ch == s1.charAt(j))
{
w = w+ch;
}
}}
System.out.println(w);
char m[] = new char[5];
for(i=0;i<5;i++)
{
m[i] = w.charAt(i);
}
System.out.println("The new array is");
for(i=0;i<5;i++)
{
System.out.print(m[i]+"\t");
}
}
}
