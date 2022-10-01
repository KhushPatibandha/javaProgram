// Print numbers from 1 to 5. with recursion

public class problem24 
{
    public static void printNumbers(int n)
    {
        if(n == 6)
        {
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main(String[] args) 
    {
        printNumbers(1);
    }    
}
