/*WAP TO CHECK FOR A PERFECT CUBE*/
import java.util.Scanner;
class forty_nine
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int i,flag = -1;
for(i=0;i<=n;i++)
{
if(i*i*i==n)
{
flag = 0;
break;
}
}
if(flag==0)
{
System.out.println("PERFECT CUBE");
}
else
{
System.out.println("NOT A PERFECT CUBE");
}
}
}
