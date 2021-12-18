import java.util.*;
public class A_union_B {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in set 1");
        int n1 = sc.nextInt();
        System.out.println("Enter the set elements");
        int set1[] = new int[n1];
        int i,j;
        for(i=0;i<n1;i++)
        {
            set1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in set 2");
        int n2 = sc.nextInt();
        System.out.println("Enter the set elements");
        int set2[] = new int[n2];
        for(i=0;i<n2;i++)
        {
            set2[i] = sc.nextInt();
        }
        int set3[] = new int[n1+n2];
        int k = 0;
        for(i=0;i<n1;i++)
        {
            set3[k] = set1[i];
            k++;
        }
        int flag = 0;
        for(j=0;j<n2;j++)
        {
            flag = 0;
            for(i=0;i<n1;i++)
            {
                if(set2[j]==set1[i])
                {
                    flag = 1;
                }
            }
            if(flag==0)
            {
                set3[k] = set2[j];
                k++;
            }
        }
        System.out.println("The union set is");
        System.out.print("{");
        for(i=0;i<k;i++) {
            if (i == (k - 1)) {
                System.out.print(set3[i]);
            } else {
                System.out.print(set3[i] + ",");
            }
        }
        System.out.print("}");
    }
}
