/*WAP TO CHECK FOR A AUTOMORPHIC NUMBER
AN AUTOMORPHIC NUMBER IS ONE WHICH IS PRESENT IN THE LAST DIGIT(S) OF ITS SQUARE
25^2 = 625*/
import java.util.Scanner;
class twenty_one
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number to be checked");
n = sc.nextInt();
int c=0,copy=n,sq=n*n;
while(n>0)
{
c++;
n = n/10;
}
System.out.println(c);
int k =sq %(int)Math.pow(10,c);
if(k==copy)
{
System.out.println("Automorphic");
}
else
{
System.out.println("Not an automorphic");
}
}
}