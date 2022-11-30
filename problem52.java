import java.util.ArrayList;

/*
 * Maze problem
 * You can only go right and down 
 * You can't go left or up
 * and need to reach a target point
 * 
 * Also print all the paths 
 * 
 * SAME AS problem51 JUST WITH ARRAYLIST
 * SAME LOGIC AND PRETTY MUCH SAME CODE JUST DECLARE ARRAYLIST
 * Answer will be in an arraylist
 */

public class problem52 
{
    static int count(int r, int c)
    {
        if(r == 1 || c == 1)
        {
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    static ArrayList<String> pathRet(String p, int r, int c)
    {
        if(r == 1 && c == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1)
        {
            list.addAll(pathRet(p + 'D', r-1, c));
        }
        
        if(c > 1)
        {
            list.addAll(pathRet(p + 'R', r, c-1));
        }

        return list;
    }

    public static void main(String[] args) 
    {
        System.out.println(pathRet("", 3, 3));
    }    
}
