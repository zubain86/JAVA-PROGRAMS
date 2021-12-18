/*WAP to reverse a number*/
import java.util.Scanner;
class twelve
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,r,sum=0;
System.out.println("Enter the number");
n = sc.nextInt();
while(n>0)
{
r = n%10;
sum = sum*10 + r;
n = n/10;
}
System.out.println("Reversed number is"+"\t"+sum);
}
}



