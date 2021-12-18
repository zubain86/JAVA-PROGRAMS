/*WAP TO CHECK FOR A CIRCULAR PRIME NUMBER
1193 - 1931 - 9311*/
import java.util.Scanner;
class fifty_two
{
static int checkprime(int n)
{
int i,k=0;
for(i=2;i<n;i++)
{
if(n%i==0)
{
k=-1;
break;
}
}
if(k==-1)
{
return(0);
}
else
{
return(1);
}
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to be checked");
int n = sc.nextInt();
String s = Integer.toString(n);
int l = s.length();
int nh=0,m,copy = n,k=0;
while(nh!=copy)
{
nh = Integer.parseInt(s.substring(1)+s.substring(0,1));
m = checkprime(nh);
if(m==0)
{
 k=1;
 break;
}
s = Integer.toString(nh);
}
if(k==1)
{
System.out.println("NOT CIRCULAR PRIME");
}
else
{
System.out.println("CIRCULAR PRIME");
}
}
}