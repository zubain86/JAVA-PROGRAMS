/*WAP TO PRINT INTERSECTION OF TWO ARRAYS*/
class sixty_five_1
{
public static void main(String args[])
{
int m[] = {1,2,3};
int n[] = {2,3,4,1};
int k = 0,i,j;
int s[] = new int [7];
for(i=0;i<3;i++)
{
for(j=0;j<4;j++)
{
if(m[i]==n[j])
{
s[k++] = m[i];
}
}
}
for(i=0;i<k;i++)
{
System.out.print(s[i]+"\t");
}
}
}