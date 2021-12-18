/*WAP TO CHECK FOR A UNIQUE NUMBER
 Unique number is that number in which there is no repetition of any digit*/
 import java.util.Scanner;
 class ten
 {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int i,n,copy,r;int fflag=0,flag=0;
         System.out.println("Enter the number to be checked");
         n = sc.nextInt();
         copy = n;
         for(i=0;i<=9;i++)
         {   fflag=0;flag=0;
             while(n>0)
             {
                 r = n%10;
                 if(r==i)
                 {
                     fflag++;
                    }
                   
                    n = n/10;
                }
                 if(fflag>1)
                    {
                        flag=-1;
                        break;
                    }
                n = copy;
            }
            if(flag==0)
            {
                System.out.println("Unique");
            }
            else
            {
                System.out.println("NOt a Unique");
            }
        }
    }

         