public class revision 
{
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String comebination)
    {
        if(idx == str.length())
        {
            System.out.println(comebination);
            return;
        }
        char currChar = str.charAt(idx);

        String mapping = keypad[currChar - '0'];

        for(int i = 0; i < mapping.length(); i++)
        {
            printComb(str, idx+1, comebination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) 
    {
        String str = "23";
        printComb(str, 0, "");
    }
}