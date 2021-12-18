/*WAP TO CHECK FOR A EVIL NUMBER
 EVIL NUMBER IS THAT NUMBER IN WHICH THERE ARE EVEN NUMBER OF 1'S IN THEIR BINARY EQUIVALENT*/
 import java.util.Scanner;
 class seventy_two
 {
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number");
 int n = sc.nextInt();
 String arr[] = {"0","1"};
 String s = "";int f=0;
 while(n>0)
 {
 int r = n%2;
 s = arr[r] + s;
 n = n/2;
}
int l = s.length();
int i;
for(i=0;i<l;i++)
{
char ch = s.charAt(i);
if(ch == '1')
{
f++;
}
}
if(f%2==0)
{
System.out.println("EVIL");
}
else
{
System.out.println("NOT AN EVIL NUMBER");
}
}}