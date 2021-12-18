import java.util.Scanner;
class encoding
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String s = sc.nextLine();
int k=0;
int i;
String s1,w="";
for(i=2;i<=s.length();)
{
s1=s.substring(k,i);
int a = Integer.parseInt(s1);
if((a>64 && a<91) || (a>96 && a<123))
{
w = w+(char)a;
k=i;
i = i+2;
}
else if(a==32)
{
w=w+" ";
k=i;
i= i+2;
}
else if((i-k)==3)
{
k=i;
i=i+2;
}
else
{
i=i+1;
}}
System.out.println(w);
}
}

