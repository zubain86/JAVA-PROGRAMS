/*WAP TO PRINT THE STRING IN A ALPHABETICAL ORDER*/
class three
{
public static void main(String args[])
{
String s = "India is my country ";
int l = s.length();
int i,j,k=0;String w = "";String arr[] = new String[20];
for(i=0;i<l;i++)
{
char ch = s.charAt(i);
if(ch!=' ')
{
w = w+ch;
}
else
{
arr[k++]=w;
w = "";
}}
for(i=0;i<k;i++)
{
System.out.print(arr[i]+" ");
}
String t = "";
for(i=0;i<k;i++)
{
for(j=0;j<k;j++)
{
String m = arr[j];
String n = arr[j+1];
if((int)m.charAt(j)>(inn.charAt(j))
{
t = arr[j+1];
arr[j+1] = arr[j];
arr[j] = t;
}
}
}
for(i=0;i<k;i++)
{
System.out.print(arr[i]+"\t");
}}}
