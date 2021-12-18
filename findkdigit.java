import java.util.*;
public class findkdigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the number");
        a = sc.nextInt();
        System.out.println("Enter the power");
        b = sc.nextInt();
        int p = (int) Math.pow(a, b);
        System.out.println("The number is: "+p);
        System.out.println("Enter the k digit to be found out");
        int k = sc.nextInt();
        String s = Integer.toString(p);
        if (k > s.length()) {
            System.out.println("Enter the valid number of digit");
        } else {
            System.out.println(s.charAt(s.length()-k));
        }
    }
}