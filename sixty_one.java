/*WAP TO INPUT A STRING IN LOWER CASE AND CONVERT INTO TITLE CASE 
ZUBAIN AHMAD  zubain ahmad*/
class sixty_one
{
public static void main(String args[])
{
String s = "Zubain Ahmad ";
int l = s.length();
int i;String w = "";
for(i=0;i<l;i++)
{
char ch = s.charAt(i);
if(ch!=' ')
{
w = w+ch;
}
else
{
int k =(int)w.charAt(0);
char ch1 =(char)( k+32);
System.out.print(ch1+w.substring(1)+"\t");
w = "";
}
}
}
}