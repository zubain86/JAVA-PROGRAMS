import java.util.StringTokenizer;
import java.util.Scanner;
class middle
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name");
String n = sc.nextLine();
String arr[] = new String [100];
StringTokenizer st = new StringTokenizer(n);
int p=0;
while(st.hasMoreTokens())
{
arr[p] = st.nextToken();
p++;
}
int i;
String w = "";
w = w+arr[0]+" "+arr[2];
System.out.println("Name according to typist"+"\t"+w);
}
}
