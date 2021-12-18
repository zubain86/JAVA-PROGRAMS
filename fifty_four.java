/*WAP TO CHECK FOR A KAPARCHAR NUMBER*/
import java.util.Scanner;
class fifty_four
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Kaparchar number");
int n = sc.nextInt();
String s = Integer.toString(n);
int l = s.length();
int sq = n*n;
int q = sq/(int)Math.pow(10,l);
int r = sq%(int)Math.pow(10,l);
int t = q+r;
if(t == n)
{
System.out.println("Kaparchar");
}
else
{
System.out.println("Not a Kaperchar");
}
}
} 