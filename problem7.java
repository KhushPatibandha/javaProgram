// Make a function to print the table of a given number n.

import java.util.Scanner;

public class problem7 
{
    public static void printTable(int n)
    {
        for(int i = 1; i <= 10; i++)
        {   
            System.out.println(n +" x "+ i +" = "+ (n*i));
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printTable(n);
    }    
}
