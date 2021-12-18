import java.util.Scanner;
class duck
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int flag = 0;
while(n>0)
{
int r = n%10;
if(r==0)
{
flag=-1;
break;
}
n = n/10;
}
if(flag==-1)
{
System.out.println("Duck");
}
else
{
System.out.println("Not duck");
}
}
}