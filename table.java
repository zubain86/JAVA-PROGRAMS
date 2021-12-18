import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print a table");
        n = sc.nextInt();
        int i;int mul;
        for(i=1;i<=10;i++)
        {
           mul = n * i;
           System.out.println(n+"X"+i+"="+mul);
        }
    }
} 