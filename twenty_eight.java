/*WAP TO SWAP THE STRING WIYHOUT USING THIRD*/
class twenty_eight
{
public static void main(String args[])
{
String a,b;
a = "Ahmad";
b = "Zubain";
int l = a.length();
a = a+b;
b = a.substring(0,l);
a = a.substring(l);
System.out.println(a+"\t"+b);
}
}