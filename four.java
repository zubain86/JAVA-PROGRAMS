/*WAP to check angstorm number 1^3+5^3+3^3=153*/
import java.util.Scanner;
class four
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,sum = 0,r;
System.out.println("Enter the value of number");
n = sc.nextInt();
int copy = n;
while(n>0)
{
r = n%10;
sum = sum + (int)Math.pow(r,3);
n = n/10;
}
if(sum==copy)
{
System.out.println("Angstorm");
}
else
{
System.out.println("Not an Angstorm");
}
}
}
