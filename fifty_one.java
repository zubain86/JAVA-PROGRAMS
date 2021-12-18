/*WAP TO PRINT PRIME PALINDROME NUMBER IN A GIVEN STRING*/
class fifty_one
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
static int checkpalin(int n)
{
int copy = n,sum=0;
while(n>0)
{
int r = n%10;
sum = sum*10+r;
n = n/10;
}
if(sum == copy)
{
return(1);
}
else
{
return(0);
}
} 
public static void main(String args[])
{
int i,n,s;
for(i=10;i<1000;i++)
{
n = checkprime(i);
if(n==1)
{
s = checkpalin(i);
if(s==1)
{
System.out.println("Prime Palindrome"+i);
}
}}}}
