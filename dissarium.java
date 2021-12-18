import java.util.Scanner;
class dissarium
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int copy = n;
String s = Integer.toString(n);
int l = s.length();
int sum = 0;
while(n>0)
{
int r = n%10;
sum = sum + (int)Math.pow(r,l--);
n = n/10;
}
if(sum==copy)
{
System.out.println("dissarium");
}
else
{
System.out.println("not dissarium");
}
}
}