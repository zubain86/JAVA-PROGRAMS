import java.util.Scanner;
class kaperchar
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
String s = Integer.toString(n);
int l = s.length();
int sq = n*n;
int q = sq/(int)Math.pow(10,l);
int r = sq%(int)Math.pow(10,l);
if(q+r==n)
{
System.out.println("kaperchar");
}
else
{
System.out.println("Not kaperchar");
}
}
}