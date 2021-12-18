import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double b,h;
        b = sc.nextDouble();
        h = sc.nextDouble();
        try
        {
        if(b>=-100&&b<=100&&h>=-100&&h<=100)
        {
            if(b<=0||h<=0)
            {
                throw new Exception("Breadth and height must be positive");
            }
            else
            {
                double area = b*h;
                System.out.println(area);
            }
       } }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}