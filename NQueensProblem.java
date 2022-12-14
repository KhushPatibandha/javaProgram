// The N Queens Problem
// Time complexity = O(n^n)
// ****************************************************************************


import java.util.ArrayList;
import java.util.List;

public class NQueensProblem 
{
    public static boolean isSafe(int row, int col, char[][] board)
    {
        // Horizontal
        for(int j = 0; j < board.length; j++)
        {
            if(board[row][j] == 'Q')
            {
                return false;
            }
        }

        // Vertical
        for(int i = 0; i < board[0].length; i++)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        // Upper left
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--, r--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        // Upper right
        r = row;
        for(int c = col; c < board.length && r >= 0; r--, c++)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        // Lower left
        r = row;
        for(int c = col; c >= 0 && r < board.length; r++, c--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        // Lower right 
        r = row;
        for(int c = col; c < board.length && r < board.length; c++, r++)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        return true;
    }

    
    public static void saveBoard(char[][] board, List<List<String>> allBoard)
    {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i = 0; i < board.length; i++)
        {
            row = "";

            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == 'Q')
                {
                    row += 'Q';
                }
                else
                {
                    row += '.';
                }

            }
            
            newBoard.add(row);
        }
        
        allBoard.add(newBoard);
    }


    public static void helper(char[][] board, List<List<String>> allBoard, int col)
    {
        if(col == board.length)
        {
            saveBoard(board, allBoard);
            return;
        }

        for(int row = 0; row < board.length; row++)
        {
            if(isSafe(row, col, board))
            {
                board[row][col] = 'Q';
                helper(board, allBoard, col+1);
                board[row][col] = '.';
            }
        }
    }


    public static void main(String[] args) 
    {
        int n = 4;
        
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoard, 0);
        
        System.out.println(allBoard);
    }
}