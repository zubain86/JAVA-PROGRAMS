import java.util.Scanner;
public class lcm {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the two numbes");
        a = sc.nextInt();
        b = sc.nextInt();
       int max = Math.max(a,b);
       int s = max;
       int min = Math.min(a,b);
       int i,flag = 0;
       while(flag==0)
       {
           if(max%min==0)
           {
               flag = 1;
           }
           else
           {
               max = max + s;
           }
       }

        System.out.println("The least common multiple is: "+max);
    }
}
