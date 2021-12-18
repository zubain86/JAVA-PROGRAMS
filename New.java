import java.util.Scanner;
class New
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int i;
        for(i=1;i<=T;i++)
        {
            long n;
            try
            {
            n = sc.nextLong();
            if(n>=-128 && n<=127)
            {
                System.out.printf("%d can be fitted in",n);
                System.out.println(" ");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(n>=-32768 && n<=32767)
            {
                System.out.printf("%d can be fitted in",n);
                System.out.println(" ");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(n>=-2147483648 && n<=2147483647)
            {
                System.out.printf("%d can be fitted in",n);
                System.out.println(" ");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(n>=(long)Math.pow(-2,63) && n<=(long)Math.pow(2,63))
            {
                System.out.printf("%d can be fitted in",n);
                System.out.println(" ");
                System.out.println("* long");
            }
            else
            {
                System.out.println("n can't be fitted anywhere");
            }
        }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere");
        }
     }
     }
}