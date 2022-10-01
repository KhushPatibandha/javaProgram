// calculate the factorial of a number. **************************

import java.util.Scanner;

public class problem6 
{
    public static void printFacto(int n)
    {
        if(n < 0)
        {
            System.out.println("Invalid number");
        }

        int factorial = 1;

        for(int i = n; i >= 1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printFacto(n);
    }    
}
