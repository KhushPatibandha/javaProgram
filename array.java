import java.util.Scanner;

public class array 
{
    public static void main(String[] args) 
    {
        // int marks[] = new int[3];
        // marks[0] = 99;
        // marks[1] = 98;
        // marks[2] = 97; 
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        
        
        // int marks[] = {99, 98, 97};
        // for(int i = 0; i < 3; i++)
        // {
        //     System.out.println(marks[i]);
        // }
        
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            number[i] = sc.nextInt();
        }
        System.out.println("**********");
        // print the numbers in array
        for(int i = 0; i < number.length; i++)
        {
            System.out.println(number[i] +" ");
        }
        sc.close();
    }    
}
