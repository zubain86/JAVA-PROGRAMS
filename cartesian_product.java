import java.util.*;
class cartesian_product
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in set1");
         int n = sc.nextInt();
        System.out.println("Enter the number of elements in set2");
         int m = sc.nextInt();
        int set1[] = new int [n];
        int set2[] = new int [m];
        int i,j;
        System.out.println("Enter the first set");
        for(i=0;i<n;i++)
        {
            set1[i] = sc.nextInt();
        }
        System.out.println("Enter the second set");
        for(i=0;i<m;i++)
        {
            set2[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.println("("+set1[i]+","+set2[j]+")");
            }
        }
    }
}