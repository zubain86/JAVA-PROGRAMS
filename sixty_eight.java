/*WAP TO PRINT PRIME TRIPLET IN A GIVEN RANGE
n   n+2    n+6
     or
n   n+4    n+6*/         
import java.util.Scanner;
class sixty_eight
{
static boolean isprime(int num)
{
int i,f=0;
for(i=2;i<num;i++)
{
if(num%i==0)
{
f=-1;
break;
}
}
if(f==-1)
{
return(false);
}
else
{
return(true);
}
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the range");
int n = sc.nextInt();
int i;
for(i=1;i<=n;i++)
{
if(isprime(i)&&isprime(i+2)&&isprime(i+6))
{
System.out.print(i+"\t"+(i+2)+"\t"+(i+6));
}
System.out.println("");
if(isprime(i)&&isprime(i+4)&&isprime(i+6))
{
System.out.print(i+"\t"+(i+4)+"\t"+(i+6));
}
}
}
}
