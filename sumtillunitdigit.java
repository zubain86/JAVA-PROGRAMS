import java.util.*;
public class sumtillunitdigit {
    static int sum(int a)
    {
        int sum = 0;
        while(a!=0)
        {
            int r = a%10;
            sum = sum + r;
            a = a/10;
        }
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number");
        a = sc.nextInt();
        while(a>9)
        {
             a = sum(a);
        }
        System.out.println("Single digit: "+a);
    }

}
