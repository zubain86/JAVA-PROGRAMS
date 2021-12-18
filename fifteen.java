/*WAP TO CHECK WHETHER A GIVEN NUMBER IS APART OF FIBONACCI NUMBER OR NOT*/
import java.util.Scanner;
class fifteen
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number");
n = sc.nextInt();
int a=0,b=1,c=0;
{
while(c<n)
{
c=a+b;
b=a;
a=c;
}
if(c==n)
{
System.out.println("Fibonacci number");
}
else
{
System.out.println("Not a fibonacci number");
}
}
}}  