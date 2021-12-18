import java.util.*;
public class balanced_number {
    static int check(int a)
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
        System.out.println("Enter the odd digit number");
        a = sc.nextInt();
        String s = Integer.toString(a);
        int l = s.length();
        int m = (l/2);
        String first = s.substring(0,m);
        String last = s.substring(m+1,l);
        int fi = Integer.parseInt(first);
        int la = Integer.parseInt(last);
        int c1 = check(fi);
        int c2 = check(la);
        if(c1==c2)
        {
            System.out.println("Balanced number");
        }
        else
        {
            System.out.println("Not a balanced number");
        }

    }
}
