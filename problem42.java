// Print all Permutations with backtracking
// Time complexity - O(n*n!)


public class problem42 
{
    public static void printPermu(String str, String perm, int idx)
    {
        if(str.length() == 0)
        {
            System.out.println(perm);
            return;
        }
        for(int i = 0; i < str.length(); i++)
        {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermu(newStr, perm+currChar, idx+1);
        }
    }
    public static void main(String[] args) 
    {
        String str = "ABC";
        printPermu(str, "", 0);
    }    
}