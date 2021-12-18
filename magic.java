import java.util.Scanner;
class magic
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int sum=0;
while(n>9)
{
while(n>0)
{
int r = n%10;
sum = sum +r;
n = n/10;
}
n = sum;
sum = 0;
}
if(n==1)
{
System.out.println("magic");
}
else
{
System.out.println("NOT magic");
}
}
}


