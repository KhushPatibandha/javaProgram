// Print the fibonacci sequence till nth term.
// *********

public class problem27 
{
    public static void printFibo(int a, int b, int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(a);
        printFibo(b, a+b, n-1);
    }
    public static void main(String[] args) 
    {
        printFibo(0, 1, 5);
    }   
}
