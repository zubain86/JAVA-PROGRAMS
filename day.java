import java.util.Scanner;
class day
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the day of the week");
        n = sc.nextInt();
        String arr[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("The day corresponding to the number is"+" "+arr[n-1]);
        int l = arr.length;
        System.out.println(l);
    }
}    