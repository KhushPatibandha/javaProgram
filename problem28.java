// Print x^n (with stack height = n)
// ******************

public class problem28 
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
        int xPownm1 = printPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String[] args) 
    {
        System.out.println(printPower(5, 2));
    }    
}
