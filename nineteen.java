/*WAP TO CHECK A SPECIAL TWO DIGIT NUMBER
sum of digits of a number + product of digits of a number = number*/
import java.util.Scanner;
class nineteen
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();int copy = n,sum=0,pro=1;
while(n>0)
{
int r = n%10;
sum = sum+r;
pro = pro * r;
n = n/10;
}
int k = sum+pro;
if(k == copy)
{
System.out.println("Special");
}
else
{
System.out.println("Not a special");
}
}
}