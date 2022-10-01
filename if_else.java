import java.util.Scanner;

// import java.util.*;
public class if_else 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("You are an adult");
        }

        else
        {
            System.out.println("You are not an adult");
        }
        sc.close();
    }    
}
