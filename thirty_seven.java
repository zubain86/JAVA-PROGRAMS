/*WAP TO PRINT HAPPY NUMBER
28 - 2^2+8^2 = 68 - 6^2+8^2 = 100 - 1^2 + 0^2 + 0^2 = 1*/
import java.util.Scanner;
class thirty_seven
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n = sc.nextInt();
int sum;
while(n>9)
{
sum =0;
while(n>0)
{
int r = n%10;
sum = sum + (int)Math.pow(r,2);
n = n/10;
}
n = sum;
}
if(n == 1)
{
System.out.println("happy");
}
else
{
System.out.println("Not a happy number");
}
}
}