/*WAP TO CHECK FOR A LEAP YEAR*/
import java.util.Scanner;
class sixty_six
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the year");
int y = sc.nextInt();
if(y%100==0)
{
if(y%400==0)
{
System.out.println("LEAP YEAR");
}
else
{
System.out.println("NOT A LEAP YEAR");
}}
else if(y%4==0)
{
System.out.println("LEAP");
}
else
{
System.out.println("NOT A LEAP YEAR");
}
}
}
