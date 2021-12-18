/*S = 1 + x^2/3!-x^4/5!+x^6/7!+------n*/
import java.util.Scanner;
class fifty_eight
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int sign = 1; int s = 0;
int i,j;int x=1;
System.out.println("Enter the number of terms");
int n = sc.nextInt();
for(i=1;i<=n-1;i++)
{
int f = 1;
x =(int)Math.pow(x,i+1);
for(j=i+2;j>0;j--)
{
f = f*j;
}
int p = x/f;
p = p*sign;
s = s+p;
sign = sign * -1;
}
int total  = 1+s;
System.out.println(total);
}
}