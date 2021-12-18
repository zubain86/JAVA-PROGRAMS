import java.util.*;
public class leastprimefactors {
    static int prime(int a)
    {
        int i,count=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count>2)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    static int checkleastprimefactor(int a) {
        int i, r;
        if (a == 1) {
            return 1;
        }
        for (i = 2; i <= a; i++) {
            if (a % i == 0) {
                r = prime(i);
                if (r == 1) {
                    break;
                }
            }
        }
        return  i;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Enter the number N");
        N = sc.nextInt();
        if(N>=2&&N<=1000)
        {
            int i;
            for(i=1;i<=N;i++)
            {
                int k = checkleastprimefactor(i);
                System.out.print(k+"\t");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }

}
