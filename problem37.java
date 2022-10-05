// Print all unique subsequences of a string.
// Time complexity = O(2^n)
// **********************************

import java.util.HashSet;

public class problem37 
{
    public static void subsequences(String str, int idx, String newString, HashSet<String>set)
    {
        if(idx == str.length())
        {
            if(set.contains(newString))
            {
                return;
            }
            else
            {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        // to me 
        subsequences(str, idx+1, newString+currChar, set);

        // not to be
        subsequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) 
    {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }    
}