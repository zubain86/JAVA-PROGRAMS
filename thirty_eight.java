/*WAP TO PRINT DISSARIUM NUMBER
135 - 1^1 + 3^2 + 5^3 = 135*/
import java.util.Scanner;
class thirty_eight
{
static int power(int k)
{
int s=0;
while(k>0)
{
s++;
k = k/10;
}
return(s);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int copy = n,sum = 0,m=power(n);
while(n>0)
{
int r = n%10;
sum = sum + (int)Math.pow(r,m);
n = n/10;
m--;
}
if(sum == copy)
{
System.out.println("Dissarium");
}
else
{
System.out.println("Not a dissarium");
}
}
}