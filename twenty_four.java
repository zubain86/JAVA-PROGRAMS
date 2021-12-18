/*WAP TO PRINT THE SUM OF SERIES
 S = 1+2/1*2 + 2+3/2*3 + 3+4/3*4 + 4+5/4*5 +----------N*/
 import java.util.Scanner;
 class twenty_four
 {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int n;
         System.out.println("Enter the number of terms");
         n = sc.nextInt();
         int i,j,sum = 0,p,s;
         for(i=1;i<=n;i++)
         {
j = i+1;
s = i+j;
p = i*j;
sum = sum + (s/p);
}
System.out.println(sum);
}
}
         
