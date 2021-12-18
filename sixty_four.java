/*WAP TO PRINT VALUE OF MOBIUS FUNCTION
24 - 2 2 2 3
REPETITION OCCURS SO OUTPUT IS ZERO
30 - 2 3 5
NO REPETITION BUT NO. OF FACTORS ARE ODD SO OUTPUT IS -1
6 - 2 3
NO REPETITION BUT NO. OF FACTORS ARE EVEN SO OUTPUT IS 1*/
class sixty_four
{
public static void  main(String args[])
{
int n =6;
int copy = n;
int rep = 0,f=0,i;
for(i=2;i<=copy;i++)
{
while(n%i==0)
{
if(i==rep)
{
f=-1;
break;
}
else
{
rep = i;
f++;
}
n = n/i;
}
if(f==-1)
{break;}
}
if(f==-1)
{
System.out.println("0");
}
else if(f%2==0)
{
System.out.println("1");
}
else
{
System.out.println("-1");
}
}
}
 