/*WAP TO PRINT LCM OF TWO NUMBERS*/
import java.util.Scanner;
class fifty_nine
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int lcm = 1;
while(true)
{
if(lcm%a==0&&lcm%b==0)
{
System.out.print(lcm);
break;
}
lcm++;
}
}
}
