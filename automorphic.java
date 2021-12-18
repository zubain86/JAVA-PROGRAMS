import java.util.Scanner;
class automorphic
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int copy = n;
String s = Integer.toString(copy);
int l = s.length();
int sq = n*n;
int r = sq%(int)Math.pow(10,l);
if(r==n)
{
System.out.println("automorphic");
}
else
{
System.out.println("not automorphic");
}
}
}
