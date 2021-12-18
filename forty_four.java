/*WAP FOR BUBBLE SORTING*/
import java.util.Scanner;
class forty_four
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int m[] = new int [10];
int i,j,t;
System.out.println("Enter the array");
for(i=0;i<5;i++)
{
m[i] = sc.nextInt();
}
System.out.println("The array is-");
for(i=0;i<5;i++)
{
System.out.print(m[i]+"\t");
}
for(i=0;i<5;i++)
{
for(j=0;j<4-i;j++)
{
if(m[j]>m[j+1])
{
t = m[j+1];
m[j+1] = m[j];
m[j] = t;
}
}
}
System.out.println("  ");
System.out.println("The sorted array is-");
for(i=0;i<5;i++)
{
System.out.print(m[i]+"\t");
}
}
}
