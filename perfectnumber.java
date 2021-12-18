import java.util.Scanner;
public class perfectnumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number");
        a = sc.nextInt();
        int i,sum=0;
        for(i=1;i<a;i++)
        {
         if(a%i==0)
         {
             sum = sum + i;
         }
        }
        if(sum==a) {
            System.out.println("Perfect number");
        }
        else
        {
            System.out.println("Not a perfect number");
        }

    }
}
