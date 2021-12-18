/*WAP TO PERFORM UNION OF TWO ARRAYS*/
class sixty_five
{
public static void main(String args[])
{
int m1[] = {1,2,3};
int m2[] = {4,5,3,2,7};
int l1 = m1.length;
int l2 = m2.length;
int k = 0;
int m3[] = new int[l1+l2] ;
int i,j,f=0;
for(i=0;i<m1.length;i++)
{
m3[k++] = m1[i];
}
for(j=0;j<m2.length;j++)
{
for(i=0;i<m1.length;i++)
{
if(m2[j]== m1[i])
{
f=-1;
}
}
if(f!=-1)
{
m3[k++] = m2[j];
}
f=0;
}
System.out.println("Union is-");
for(i=0;i<k;i++)
{
System.out.print(m3[i]+"\t");
}
}
}