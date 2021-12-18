/*WAP TO PRINT CALCULATION ACCORDING TO GIVEN STRING
15*6=90*/
class seventy_one
{
public static void main(String args[])
{
String s = "15*15=225";
int l = s.length();
int pos=0,pos1=0;
int i;char ch;
for(i=0;i<l;i++)
{
ch = s.charAt(i);
if(ch=='*'||ch=='/'||ch=='+'||ch=='-')
{
pos = i;
break;
}
}
for(i=0;i<l;i++)
{
char ch1 = s.charAt(i);
if(ch1=='=')
{
pos1 =i;
break;
}
}
ch = s.charAt(pos);
String s1 = s.substring(0,pos);
String s2 = s.substring(pos+1,pos1);
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int ans=0;
if(ch=='*')
{
 ans = a*b;
}
if(ch=='/')
{
ans = a/b;
}
if(ch=='+')
{
ans = a+b;
}
if(ch=='-')
{
ans = a-b;
}
System.out.println(ans);
}
}