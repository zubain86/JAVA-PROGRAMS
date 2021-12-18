/*WAP TO PRINT A PATTERN
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *          */
 import java.util.Scanner;
 class seventy
 {
     public static void main(String args[])
     {
Scanner sc = new Scanner(System.in); 
         int i,j,k;
System.out.println("Enter the number of terms");
int n = sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=(n-i);j++)
{
System.out.print("\t");
}
for(k=1;k<=(2*i-1);k++)
{
System.out.print("*"+"\t");
}
System.out.println("");
}
}}