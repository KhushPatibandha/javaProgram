import java.util.*;

public class functions 
{   

    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) 
    {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        printMyName(name);
    }    
}
