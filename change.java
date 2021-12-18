import java.util.Scanner;
class change
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String s = sc.nextLine();
String p = s.replace("RED","GREEN");
System.out.println(p);
}
}