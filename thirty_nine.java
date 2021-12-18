/*WAP TO CONVERT THE AMOUNT ACCORDING TO CURRENCY DDENOMINATION FORMAT
  2000 x 11 = 22000
  500  X 1  = 500
  100  X 1  = 100
  20   X 1  = 20
  10   X 1  = 10
  5    X 1  = 5
  2    X 1  = 2
  1    X 1  = 1
            22638*/
import java.util.Scanner;
class thirty_nine
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the amount");
int amt = sc.nextInt();
int arr[] = {2000,500,100,20,10,5,2,1};
int k = 0,notes;
while(amt>0)
{
notes = amt/arr[k];
if(notes>0)
{
System.out.println(arr[k]+"*"+notes+"="+arr[k]*notes);
}
amt = amt%arr[k];
k++;
}
}
}

