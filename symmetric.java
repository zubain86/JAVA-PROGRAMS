import java.util.Scanner;
class symmetric
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
int m = sc.nextInt();
System.out.println("Enter the number of columns");
int n = sc.nextInt();
int arr[][] = new int[m][n];
System.out.println("The array is");
int i,j;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr[i][j] = sc.nextInt();
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
int arr1[][] = new int[m][n];
int p=0,q=0;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr1[i][j] = arr[p][q];
p++;
}
q++;
p=0;
}
System.out.println("transpose of a matrix is");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(arr1[i][j]+"\t");
}
System.out.println();
}
int flag =0;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(arr[i][j]!=arr1[i][j])
{
flag=1;
break;
}}
if(flag==1)
{
break;
}
}
if(flag==1)
{
System.out.println("Not symmetric");
}
else
{
System.out.println("Symmetric");
}
}
}