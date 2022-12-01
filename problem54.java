/*
 * Maze problem
 * You can only go right and down 
 * You can't go left or up
 * and need to reach a target point
 * 
 * similar to problem51, problem52 and problem53
 * with rectrictions on the maze grid
 * you can go on the tile with "False" on it
 */

public class problem54 
{
    static void pathRestrictions(String p, boolean[][] maze, int r, int c)
    {
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
        {
            return;
        }

        if(r < maze.length-1)
        {
            pathRestrictions(p + 'D', maze, r+1, c);
        }

        if(c < maze[0].length-1)
        {
            pathRestrictions(p + 'R', maze, r, c+1);
        }
    }
    
    public static void main(String[] args) 
    {
        boolean[][] board = {

            {true, true, true},
            {true, false, true},
            {true, true, true}

        };

        pathRestrictions("", board, 0, 0);
    }    
}