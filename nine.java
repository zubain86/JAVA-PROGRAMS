/*WAP TO CHECK FOR A DUCK NUMBER
 A duck number is one if digit zero is present in the number*/
 import java.util.Scanner;
 class nine
 {
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 int flag=0;
 System.out.println("Enter the number to be checked");
 int n = sc.nextInt();
 while(n>0)
 {
     int r = n%10;
     if(r==0)
     {
         flag = 1;
         break;
        }
        n = n/10;
    }
    if(flag==1)
    {
    System.out.println("duck");
}
else
{
System.out.println("Not a duck");
}
}
}
 