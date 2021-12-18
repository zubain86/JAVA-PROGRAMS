import java.util.Scanner;
class Mixer
{
Scanner sc = new Scanner(System.in);
int arr[];
int n;

Mixer(int nn)
{
n = nn;
int arr[] = new int[n];
}
void accept()
{
System.out.println("Enter"+n+" elements in ascending order");
int i;
for(i=0;i<n;i++)
{
arr[i] = (int)Math.rint(10*Math.random());
}
}
Mixer mix(Mixer A)
{
Mixer B = new Mixer(n+A.n);
int x = 0;
for(int i =0 ; i<n;i++)
{
B.arr[x++] = arr[i];
}
for(int j =0 ;j<A.n;j++)
{
B.arr[x++] = A.arr[j];
}
return B;
}
void display()
{
int i;
for(i=0;i<n;i++)
{
System.out.print(arr[i]+"\t");
}
}
public static void main(String args[])
{
Mixer P = new Mixer(4);
Mixer Q = new Mixer(3);
Mixer R = new Mixer (7);
P.accept();
Q.accept();
R = P.mix(Q);
R.display();
}
}
