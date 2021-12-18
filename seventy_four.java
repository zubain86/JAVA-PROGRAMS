/*WAP TO PRINT DATE FROM A GIVEN EIGHT LETTER STRING
I - "02072018"
O - 02 JULY 2018*/
class seventy_four
{
public static void main(String args[])
{
String s = "02042018";
String d = s.substring(0,2);
String m = s.substring(2,4);
String y = s.substring(4);
int date = Integer.parseInt(d);
int month = Integer.parseInt(m);
int year = Integer.parseInt(y);
String mm[] = {"","JAN","FEB","MAR","APR","MAY","JUNE","JULY","AUG","SEP","OCT","NOV"};
int da[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
if((year%100==0&&year%400==0)||(year%4==0))
{
da[2]=29;
}
if(date>da[month]||month>12||month<0||date<0)
{
System.out.println("Invalid date");
}
System.out.println(date+"\t"+mm[month]+"\t"+year);
}
}