import java.util.Scanner;

// Print all even numbers till n.

public class problem3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }    
}
