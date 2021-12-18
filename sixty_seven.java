/*WAP TO CHECK OUT ELEMENTS FROM ARRAY ACCORDING TO PENDULUM ARRANGEMENT*/
class sixty_seven
{
public static void main(String args[])
{
int arr[] = {1,2,3,4,5,6,7,8};
String w = "";
w = w+Integer.toString(arr[0]);
int i;
for(i=1;i<arr.length;i++)
{
if(i%2!=0)
{
w = w+Integer.toString(arr[i]);
}
else
{
w = Integer.toString(arr[i])+w;
}
}
System.out.print(w);
}
}
