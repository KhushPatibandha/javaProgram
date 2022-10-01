// Write a program to enter the numbers till the user
// wants and at the end it should display the count of 
// positive, negative and zeros entered.
// ************************************************************************************************

import java.util.Scanner;

public class problem9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        System.out.println("Enter 1 to continue & and 0 to stop");
        int input = sc.nextInt();
        
        while(input == 1)
        {
            System.out.println("Enter your number");
            int numbers = sc.nextInt();

            if(numbers > 0)
            {
                positive++;
            }
            else if(numbers < 0)
            {
                negative++;
            }
            else if(numbers == 0)
            {
                zeros++;
            }

            System.out.println("Enter 1 to continue & and 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zeros);
        sc.close();
    }   
}
