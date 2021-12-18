/*WAP TO PRINT VOWELS OF EACH WORD IN A STRING*/
import java.util.Scanner;
class thirt_five
{

static int countvowels(String s)
{
int l = s.length();
int i,count=0;
System.out.print("Vowels in a word"+"\t"+s+"\t "+"are"+"\t ");
for(i=0;i<l;i++)
{
char ch = s.charAt(i);
if(ch == 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.print(ch+"\t");
count++;
}
}
return(count);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str = sc.nextLine()+" ";
String w = "  ";
int l = str.length();
int i;
for(i=0;i<l;i++)
{
char ch = str.charAt(i);
if(ch==' ')
{
int c = countvowels(w);
System.out.println("");
System.out.println("Vowels in a word"+"\t "+w+"\t "+"are"+"\t "+c);
w = "   ";
}
else
{
w = w+ch;
}
}
}
}

      