import java.util.*;
public class power_set {
    static String binary(int n1,int n2) {
        if (n1 != 0) {
            char arr[] = {'0', '1'};
            String s = "";
            while (n1 != 0) {
                if (n1 % 2 == 0) {
                    s = s + arr[0];
                } else {
                    s = s + arr[1];
                }
                n1 = n1 / 2;
            }
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            String m = sb.toString();
            while(m.length()!=n2)
            {
                m = "0" + m;
            }
            return m;

        } else {
            String s2 = "";
            while(s2.length()!=n2)
            {
                s2 = s2 + "0";
            }
            return s2;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in set");
        int n = sc.nextInt();
        System.out.println("Enter the elements of set");
        int set[] = new int[n];
        int i,j,l;
        for(i=0;i<n;i++)
        {
            set[i] = sc.nextInt();
        }
        String s = "";
        int radix = 10;
        for(i=0;i<n;i++)
        {
            s = s+Character.forDigit(set[i],radix);
        }
        int k = (int)Math.pow(2,n);
        System.out.print("{");
        for(i=0;i<k;i++)
        {
            String m = binary(i,n);
            System.out.print("{");
            for(j=0;j<n;j++)
            {
                if(m.charAt(j)=='1')
                {
                    System.out.print(s.charAt(j));
                 for(l=j+1;l<n;l++)
                 {
                     if(m.charAt(l)=='1')
                     {
                         System.out.print(",");
                         break;
                     }
                 }
                }
            }
            if(i==(k-1))
            {
                System.out.print("}");
            }
            else
            {
                System.out.print("}, ");
            }
        }
        System.out.print("}");

    }
}
