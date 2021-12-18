import java.util.StringTokenizer;
import java.util.Scanner;
class order
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String arr[] = new String[100];
System.out.println("Enter the string");
String s = sc.nextLine();
String w1 = "";
String w2 = "";
StringTokenizer st = new StringTokenizer(s);
int p=0,i;
while(st.hasMoreTokens())
{
arr[p] = st.nextToken();
p++;
}
for(i=0;i<p;i++)
{
char ch = Character.toUpperCase(arr[i].charAt(0));
w1 = w1+ch+arr[i].substring(1);
w2 = w2 + w1+" ";
w1="";
}
System.out.println("New string is"+"  "+w2);
}
}
