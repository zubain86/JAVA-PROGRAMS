import java.util.Scanner;
class frequency
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String s1 = sc.nextLine();
System.out.println("Enter the string to be checked");
String s2 = sc.nextLine();
int i,count=0;
char ch;
String w = "";
for(i=0;i<s1.length();i++)
{
ch = s1.charAt(i);
if(ch==' '||ch=='.')
{
if(w.equalsIgnoreCase(s2))
{
count++;
}
w="";
}
else
{
w=w+ch;
}
}
System.out.println("Frequency of word is"+"\t"+s2+"\t"+count);
}
}

