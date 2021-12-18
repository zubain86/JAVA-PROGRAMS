import java.util.Scanner;
class unique
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int i,copy=n;
int flag = 0,fflag = 0;
for(i=0;i<9;i++)
{
while(n>0)
{
int r = n%10;
if(r==i)
{
flag++;
}
n = n/10;
}
if(flag>1)
{
fflag = -1;
break;
}
n = copy;
flag = 0;
}
if(fflag == -1)
{
System.out.println("Not Unique");
}
else
{
System.out.println("unique");
}
}
}