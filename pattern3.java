public class pattern3 {
    public static void main(String args[])
    {
        int i,j,k=0,p;
        for(i=1;i<=4;i++) {
            p = i;
            for (j = 1; j <= 6-k; j++) {
                System.out.print(" ");
            }
            k = k+2;
            for(j=1;j<=i;j++)
            {
                System.out.print(p+++" ");
            }
            System.out.println("");
        }

    }
}
