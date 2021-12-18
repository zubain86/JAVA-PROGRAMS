/*"Pattern for N = 4

        1
        2 3
        3 4  5
        4 5 6 7"*/
public class pattern2 {
    public static void main(String args[])
    {
        int i,j;
        int p=0;
        for(i=1;i<=4;i++)
        {
            p = i;
            for(j=1;j<=i;j++)
            {
                System.out.print(p+++" ");

            }
            p = 0;
            System.out.println("");
        }
    }
}
