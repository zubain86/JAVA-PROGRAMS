import java.util.*;
public class roots_quadratic {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the coefficients");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double d = Math.pow(b,2) - (4*a*c);
        double r1,r2;
        r1 = ((-b)+Math.sqrt(a))/(2*a);
        r2 = ((-b)-Math.sqrt(a))/(2*a);
        System.out.println("Roots are: "+r1+" and "+r2);
    }


}
