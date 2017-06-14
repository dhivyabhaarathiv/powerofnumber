import java.util.*;
import java.lang.*;
public class power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long p=sc.nextLong();
        double result;
        {
            result=Math.pow(n,p);
            System.out.println(result);
        }
}
}
