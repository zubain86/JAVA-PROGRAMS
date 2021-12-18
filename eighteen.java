/*WAP TO CHECK FOR A SPY NUMBER
Spy number is that number in which sum of digits is equal to product of digits*/ 
import java.util.Scanner;
class eighteen
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int sum=0,pro = 1;
while(n>0)
{
int r = n%10;
sum = sum + r;
pro = pro * r;
n = n/10;
}
if(sum == pro)
{
System.out.println("SPY");
}
else
{
System.out.println("NOT A SPY");
}
}
}