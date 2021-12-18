/*1*2*3+2*3*4+3*4*5+.....*/
import java.util.Scanner;
public class pattern {
    static int mul(int j)
    {
        int f = 1;
        int i;
        for(i = j;i<=(j+2);i++)
        {
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms");
        n = sc.nextInt();
        int i, sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + mul(i);
        }
        System.out.println("Sum of series is: " + sum);
    }
}
