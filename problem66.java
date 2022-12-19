/*
 * Word break 
 * 
 * eg - {"i", "like", "sam", "samsung", "mobile"}
 * in the above array of string the words "ilikesamsung" exist will return true
 * 
 * if the argument passed is "ilikesung"
 * which is not there in the array of string will return false
 * because "sung" don't exist in the array of string
 * 
 * In this question we just need to return true if the word exists in the array of string 
 * or false if they don't
 * 
 * ********************************
 */

public class problem66 
{
    static class Node 
    {
        Node[] children;
        boolean endOfWord;

        public Node()
        {
            children = new Node[26];

            for(int i = 0; i < 26; i++)
            {
                children[i] = null;
            }

            endOfWord = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word)
    {
        Node curr = root;
        for(int i = 0; i < word.length(); i++)
        {
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null)
            {
                // Add new node
                curr.children[idx] = new Node();
            }

            if(i == word.length()-1)
            {
                curr.children[idx].endOfWord = true;
            }

            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) // Time complixity == O(L) == O(Length of the word)
    {
        Node curr = root;
        for(int i = 0; i < key.length(); i++)
        {
            int idx = key.charAt(i) - 'a';

            if(curr.children[idx] == null)
            {
                return false;
            }

            if(i == key.length()-1 && curr.children[idx].endOfWord == false)
            {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static boolean wordBreak(String key)
    {
        if(key.length() == 0)
        {
            return true;
        }

        for(int i = 1; i <= key.length(); i++)
        {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);

            if(search(firstPart) && wordBreak(secPart))
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) 
    {
        String words[] = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";

        for(int i = 0; i < words.length; i++)
        {
            insert(words[i]);
        }

        System.out.println(wordBreak(key));
    }    
}
