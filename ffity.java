/*WAP TO DO BINARY SEARCH*/
import java.util.Scanner;
class ffity
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); 
int m[] = new int [10];
int i,j,t;
for(i=0;i<10;i++)
{
m[i] = (int)Math.rint(10*Math.random());
}
for(i=0;i<10;i++)
{
for(j=0;j<9-i;j++)
{
if(m[j]>m[j+1])
{
t = m[j+1];
m[j+1] = m[j];
m[j] = t;
}
}
}
System.out.println("The array is");
for(i=0;i<10;i++)
{
System.out.print(m[i]+"   ");
}
System.out.println("");
System.out.println("Enter the number to be searched");
int n = sc.nextInt();
int lb=0,ub=9,p,k=0;
while(lb<=ub)
{
p = (lb+ub)/2;
if(m[p]<n)
lb = p++;
if(m[p]>n)
ub = p--;
if(m[p]==n)
{
k=-1;
break;
}
}
if(k==-1)
{
System.out.println("PRESENT");
}
else
{
System.out.println("NOT PRESENT");
}
}
}