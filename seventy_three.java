/*WAP TO PRINT SUM  OF ALL CONSECUTIVE PATTERNS
  15 = 1+2+3+4+5
     = 4+5+6
     = 7+8*/
class seventy_three
{
public static void main(String args[])
{
int n = 15;
int i,j,l;
for(i=1;i<n;i++)
{
String w = "";
int s = 0;
for(j=i;j<n;j++)
{
s = s+j;
w = w+Integer.toString(j)+"+";
if(s==n)
{
l = w.length();
System.out.println(w.substring(0,l-1));
}
}
}
}
}

   
   