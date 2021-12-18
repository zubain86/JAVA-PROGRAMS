/*WAP TO CHECK FOR A BOUNCY NUMBER
34567 - Increasing number
765432 - decreasing number
345654 - bouncy number*/
import java.util.Scanner;
class sixty_three
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
String m = Integer.toString(n);
int l = m.length();
int c= n%10,s=0;
n = n/10;
while(n>0)
{
int r = n%10;
if(r>c)
{
c=r;
s++;
}
else
{
c=r;
s--;
}
n = n/10;
}
int l1 = -1*l;
if(s==l-1)
{
System.out.println("DECREASING");
}
else if(s==l1+1)
{
System.out.println("INCREASING");
}
else
{
System.out.println("BOUNCY");
}
}
}
