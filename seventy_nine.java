/*WAP TO PRINT ROWS IN REVERSE ORDER
I- 12345  O- 11346 
   67431     77291 
   77291     67431  
   11346     12345*/
class seventy_nine
{
public static void main(String args[])
{
int i,j;
int m[][] = new int[5][5];
int n[][] = new int[5][5];
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
m[i][j] = (int)Math.rint(10*Math.random());
}
}
System.out.println("The matrix is");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println("");
}
int k = 4;
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
n[i][j] = m[k][j];
}
k--;
} 
System.out.println("The reversed matrix is");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(n[i][j]+"\t");
}
System.out.println("");
}
}
}