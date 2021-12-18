/*WAP TO calculate integer power of a base*/
import java.util.Scanner;
class thirty_four
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the base");
int b = sc.nextInt();
System.out.println("Enter the power");
int p = sc.nextInt();
int f = 1,i;
if(p!=0)
{
for(i=1;i<=(int)Math.abs(p);i++)
{
f = f*b;
}
if(p>0)
{
f = f;
}
if(p<0)
{
f = 1/f;
}
}
else
{
f = 1;
}
System.out.println(f);
}
} 