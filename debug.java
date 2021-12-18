import java.util.*;
class debug {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in set");
        int n = sc.nextInt();
        System.out.println("Enter the elements of set");
        int set[] = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            set[i] = sc.nextInt();
        }
        String s = "";
        for (i = 0; i < n; i++) {
            s = s+set[i];
        }
        System.out.println(s);
    }
}