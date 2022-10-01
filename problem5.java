// Print if a number is prime or not (Input n from the user). ***********************************

import java.util.Scanner;

public class problem5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean isPrime = true;
        
        for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                return;
            }
        }
        
        if(isPrime)
        {
            if(n == 1)
            {
                System.out.println("The number is neither prime nore composite");
            }
            else
            {
                System.out.println("The number is prime");   
            }
        }

        else
        {
            System.out.println("The number is not prime");
        }

        sc.close();
    }    
}
