/*
 * Starts with problem
 * 
 * Creat a function boolean startsWith(String prefix) for a trie
 * Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise
 * 
 * words[] = {"apple", "app", "mango", "man", "woman"}
 * 
 * eg:
 * prefix = "app"   output = true
 * prefix = "moon"  output = false
 * 
 * Basically same as the search function that we created in the trie program
 * just the difference is that we don't need to check for the endOfWord check 
 * we just want prefix not the whole word rest all will be same as search function
 * 
 */

public class problem67 
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

    public static boolean startsWith(String prefix)
    {
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++)
        {
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null)
            {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args) 
    {
        String words[] = {"apple", "app", "mango", "man", "woman"};

        for(int i = 0; i < words.length; i++)
        {
            insert(words[i]);
        }

        System.out.println(startsWith("man"));
    }    
}