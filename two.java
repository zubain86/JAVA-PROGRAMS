/*WAP TO CHECK FOR GOLDBATCH NUMBER
 IT IS A POSITIVE EVEN NUMBER WHICH CAN BE REPRESENTED AS A SUM OF TWO ODD PRIME NUMBERS*/
 import java.util.Scanner;
 class two
 {
   static  boolean isprime(int n)
     {
     int i,f=0;
     for(i=2;i<n;i++)
     {
     if(n%i==0)
     {
     f=-1;
     break;
    }}
     if(f==-1)
     {
     return(false);
    }
     else
     {
     return(true);
    }
}
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int n;
         System.out.println("Enter the number");
         n = sc.nextInt();
         if(n%2==0)
         {int i =3,k=1+i;
             while(i<k)
             {
                 k = n-i;
                 if(isprime(k)&&isprime(i))
                 {
                     System.out.println(i+"\t"+k);
                    }
                    i = i+2;
                }}
                else
                {
                    System.out.println("Enter valid number");
                }
            }
        }          
                 