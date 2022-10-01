// Input a string from the user. 
// Create a new string called ‘result’ in which
// you will replace the letter ‘e’ in the original string with letter ‘w’. 

// Example : 
// original = “eabcdef’ ; result = “wabcdif”
// Original = “xyz” ; result = “xyz”

// ***********************************

import java.util.Scanner;

public class problem20 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'e')
            {
                result += 'w';
            }
            else
            {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }    
}
