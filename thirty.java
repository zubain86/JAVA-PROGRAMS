/*WAP TO CONVERT DECIMAL INTO BINARY*/
import java.util.Scanner;
class thirty
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number");
n = sc.nextInt();
char arr[] = {'0','1'};
String s = "  ";
while(n>0)                                                                                                                                                      
{
int r = n%2;
s = arr[r]+s;
n=n/2;
}
System.out.println("Binary form is"+s);
}
} 