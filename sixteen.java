/*WAP TO PRINT HCF OF TWO NUMBERS*/
import java.util.Scanner;
class sixteen
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two numbers");
int p = sc.nextInt();
int q = sc.nextInt();
int i,hcf=0;
for(i=1;i<=p;i++)
{
if(p%i==0&&q%i==0)
{
hcf=i;
}}
System.out.println(hcf);
}
}

