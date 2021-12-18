/*WAP TO CONVERT A NUMBER INTO WORDS*/
import java.util.Scanner;
class forty_eight
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number");
n = sc.nextInt();  
String arr[] = {" zero"," one"," two"," three"," four"," five"," six"," seven",
" eight"," nine"};
String w ="";
while(n>0)
{
int r = n%10;
w = arr[r]+w;
n = n/10;
}
System.out.println(w);
}
}
