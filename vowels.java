import java.util.Scanner;
class vowels
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String s = sc.nextLine();
int l = s.length();
int i,j;
String w = "";
for(i=0;i<l;i++)
{
char ch = s.charAt(i);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
continue;
}
else
{
w = w+ch;
}
}
String s1 = w.toUpperCase();
String w1 = "";
char ch1;
for(ch1='A';ch1<='Z';ch1++)
{
for(j=0;j<s1.length();j++)
{
char ch2 = s1.charAt(j);
if(ch1==ch2)
{
w1 = w1+ch1;
}
}
}
String w2 = w1.substring(1);
String w3 = w2.toLowerCase();
String w4 = "";
w4 = w4 + w1.charAt(0)+w3;
System.out.println(w4);
}
}