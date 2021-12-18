/*WAP TO CHECK FOR SMITH NUMBER
666 - 2 3  3 37
6+6+6 - 2+3+3+3+7*/
import java.util.Scanner;
class thirty_three
{

static int sumofdigits(int m)
{
int sum = 0;
while(m>0)
{
int r = m%10;
sum = sum + r;
m = m/10;
}
return(sum);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();int i,sum = 0,copy=n,k,k1;
for(i=2;i<=n;i++)
{
while(n%i == 0)
{
k1 = sumofdigits(i);
sum = sum + k1;
n = n/i;
}
}
k = sumofdigits(copy);
if(k==sum)
{
System.out.println("Smith");
}
else
{
System.out.println("Not a smith");
}
}}

