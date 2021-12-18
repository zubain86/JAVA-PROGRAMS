/*WAP TO FIND HIGHEST POTENTIAL IN THE WORD
A+B = 65 +66 = 131*/
import java.util.Scanner;
class thirty_six
{

static int countpotential(String s)
{
int l = s.length();
int i,sum=0;
for(i=0;i<l;i++)
{
char ch = s.charAt(i);
sum = sum + (int)ch;
}
return(sum);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str = sc.nextLine()+" ";
int len = str.length();
int i,cp=-1;
String w = "  ",k="  ";
for(i=0;i<len;i++)
{
char ch = str.charAt(i);
if(ch == ' ')
{
int c = countpotential(w);
if(c>cp)
{
cp = c;
k = w;
}
w = "  ";
}
else
{
w = w+ch;
}
}
System.out.println("Highest potential of a word is"+" "+k+" "+cp);
}
}