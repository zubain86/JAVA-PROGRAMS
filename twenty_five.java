/*WAP TO PRINT A GIVEN PATTERN B L U E J  
                               L U E J B
                               U E J B L
                               E J B L U
                               J B L U E*/
class twenty_five
{
public static void main(String args[])
{
String s =  "BLUEJ";
int i,l;
l = s.length();
for(i=0;i<l;i++)
{
System.out.print(s.substring(i) + s.substring(0,i));
System.out.println(" ");
}
}
}

 