/*WAP TO PRINT FREQUENCY OF DIGIT OF GIVEN NUMBER*/
import java.util.Scanner;
class fourteen
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number");
n = sc.nextInt();
int i,flag=0,copy=n;
for(i=0;i<=9;i++)
{
while(n>0)
{
int r = n%10;
if(r==i)
{
flag++;
}
n = n/10;
}
System.out.println("The frquency of number"+"\t"+i+"  "+"is"+" "+flag);
n = copy;
flag = 0;
}
}
}

