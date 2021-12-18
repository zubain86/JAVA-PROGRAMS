/*WAP TO PRINT DIVISION OF TWO NUMBERS WITHOUT USING '/' */
class seventy_eight
{
public static void main(String args[])
{
int a = 6;
int b = 2;
int max = a>b?a:b;
int min = a<b?a:b;
int c = 0;
while(max>0)
{
max = max-min;
if(max>=0)
{
c++;
}}
System.out.println(c);
}}