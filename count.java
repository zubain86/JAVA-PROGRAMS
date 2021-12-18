import java.util.*;
public class count {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int A,B;
        System.out.println("Enter the range");
        A = sc.nextInt();
        B = sc.nextInt();
        int i;
        int M;
        int count = 0;
        System.out.println("Enter the number which divides");
        M = sc.nextInt();
        for(i=A;i<B;i++)
        {
            if(i%M==0)
            {
                count++;
            }
        }
        System.out.println("Count is: "+count);
    }
}
