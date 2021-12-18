/*WAP TO PRINT PALINDROME NUMBERS BETWEEN 10 TO 1000*/
class eleven
{
public static void main(String args[])
{

int i,r,sum,copy;
for(i=10;i<=1000;i++)
{
sum=0;copy = i;
while(i>0)
{
r = i%10;
sum = sum*10+r;
i = i/10;
}
if(sum == copy)
{
System.out.println(copy+"\t"+"is a palindrome");
}
else
{
System.out.println("Not a palindrome"+"\t"+copy);
}
i=copy;
}
}
}

