/*WAP TO FILL 2D ARRAY WITH GIVEN 3 CHARACTERS
@ in diagonal
# in top and bottom
* in left and right*/
class one
{
public static void main(String args[])
{
char m[][] = new char[5][5];
int i,j;
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
if((i+j==4)||(i==j))
{
m[i][j] = '@';
}
if(j>i&&j+i<4)
{
m[j][i] = '*';
m[i][j] = '#';

}
if(j>i&&j+i>4)
{
m[i][j] = '*';
m[j][i] = '#';
}

}
}
System.out.println("The array is");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println("");
}
}}