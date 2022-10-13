import java.util.Scanner;

public class revision 
{
    public static int printPower(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(x == 0)
        {
            return 0;
        }
        // if n is even
        if(n % 2 == 0)
        {
            return printPower(x, n/2) * printPower(x, n/2);
        }

        // if n is odd 
        else
        {
            return printPower(x, n/2) * printPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(printPower(5, 2));
    }
}
