import java.util.Scanner;

public class GCD {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int g=0;
        int a,b;
        System.out.println("Enter the two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        int m = Math.max(a,b);
        int i;
        for(i=1;i<=m;i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                g = i;
            }
        }
        System.out.println("Greatest common divisor is: "+ g);
    }

}
