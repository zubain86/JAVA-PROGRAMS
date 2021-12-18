import java.util.Scanner;
class angstorm
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int sum = 0,copy =n;
while(n>0)
{
int r = n%10;
sum = sum + (int)Math.pow(r,3);
n = n/10;
}
if(sum==copy)
{
System.out.println("ANGSTOrm");
}
else
{
System.out.println("Not a ANGSTORM");
}
}
}