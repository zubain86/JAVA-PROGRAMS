/*WAP TO PRINT DIFFERENCE OF TWO DATES*/
class sixty_nine
{
public static void main(String args[])
{
int d,cd,m,cm,y,cy;
d=10;
m = 11;
y = 2018;
cd = 1;
cm = 2;
cy = 2019;
if(d>cd)
{
cd = cd+30;
cm = cm-1;
}
if(m>cm)
{
cm = cm+12;
cy = cy-1;
}
int days = cd-d;
int months = cm-m;
int year = cy - y;
System.out.print(days+" "+months+" "+year);
}
}