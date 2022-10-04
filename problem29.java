// Print x^n (with stack height = logn) with recursion
// ************************

public class problem29 
{
    public static int printPower(int x, int n)
    {
        if(x == 0)
        {
            return 0;
        }

        if(n == 0)
        {
            return 1;
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
