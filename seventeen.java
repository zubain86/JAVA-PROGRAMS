/*WAP TO PRINT PRIME FACTOR OF A NUMBER*/
import java.util.Scanner;
class seventeen
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int i;
for(i=2;i<=n;i++)
{
while(n%i==0)
{
System.out.print(i);
System.out.print("  ");
n = n/i;
}
}
}
}
