import java.util.Scanner;
class nfj
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
int i;
System.out.println("Enter the array");
for(i=0;i<5;i++)
{
a[i] = sc.nextInt();
}
int max = 0;

for(i=0;i<5;i++)
{
if(a[i]>a[max])
{
max=i;
}
}
System.out.println(max);
}
}