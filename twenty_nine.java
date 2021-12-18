/*WAP TO CHECK FOR A PERFECT NUMBER
 XYZ = X! + Y! + Z!*/
 import java.util.Scanner;
 class twenty_nine
 {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int n;
         System.out.println("Enter the number");
         n = sc.nextInt();
         int sum=0,copy = n;
         while(n>0)
         {
int r = n%10;
sum = sum + fact(r);
n = n/10;
}
if(sum == copy)
{
System.out.println("Perfect");
}
else
{
System.out.println("Not a perfect");
}
}
static int fact(int k)
{
int f= 1,i;
for(i=0;i<=k;i++)
{
f = f*i;
}
return(f);
}
} 