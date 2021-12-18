/*WAP TO PRINT A FIBONACCI SERIES 0,1,1,2,3,5,8,13-----*/
import java.util.Scanner;
class thirteen
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number of terms");
n = sc.nextInt();
int a=0,b=1,c=0,i;
for(i=1;i<=n;i++)
{
System.out.print(c);
System.out.print("  ");
c = a+b;
b = a;
a = c;
}
}
}

