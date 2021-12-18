import java.util.Scanner;
class lucky
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter the cell elements");
int i;
for(i=0;i<n;i++)
{
arr[i] = sc.nextInt();
}
System.out.println("The array is");
for(i=0;i<n;i++)
{
System.out.print(arr[i]+"\t");
}
int k =1;i=0;

while(k<n)
{
for(i=0;i<n;i++)
{
arr[i] = arr[k];
i++;
k = k+p;
}
