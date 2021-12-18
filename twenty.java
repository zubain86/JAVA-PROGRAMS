/*WAP TO PRINT DIGITAL SUM OF A NUMBER
Addition till one digit number is achieved*/
import java.util.Scanner;
class twenty
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int sum = 0;
while(n>9)
{   sum=0;
 while(n>0)
 {
     int r = n%10;
     sum = sum + r;
     n = n/10;
    }
    n = sum;
}
System.out.println("Digital sum is"+"  "+n);
}
}