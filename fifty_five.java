/*WAP TO DELETE A GIVEN ELEMENT IN A GIVEN SDA WITHOUT USING OTHER ARRAY*/
import java.util.Scanner;
class fifty_five
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); 
int i,j;
int m[] = new int [5];
for(i=0;i<5;i++)
{
m[i] = (int)Math.rint(10*Math.random());
}
System.out.println("The array is");
for(i=0;i<5;i++)
{
System.out.print(m[i]+"\t");
}
System.out.println("");
System.out.println("Enter the position of element to be deleted");
int pos = sc.nextInt();
for(j=pos+1;j<5;j++)
{
m[j-1] = m[j];
}
System.out.println("The new array after deletion");
for(i=0;i<4;i++)
{
System.out.print(m[i]+"\t");
}
}
} 

