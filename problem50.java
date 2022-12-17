// Search in a sorted matrix
// **********************************


import java.util.Arrays;
public class problem50 
{
    // Search in the row provided between the col provided
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target)
    {
        while(colStart <= colEnd)
        {
            int mid = colStart + (colEnd-colStart)/2;

            if(matrix[row][mid] == target)
            {
                return new int[] {row, mid};
            }

            if(target < matrix[row][mid])
            {
                colEnd = mid-1;
            }
            else
            {
                colStart = mid+1;
            }
        }

        return new int[] {-1, -1};
    }

    static int[] search(int[][] matrix, int target)
    {
        int row = matrix.length;
        int col = matrix[0].length; // Now be cautious, matrix may be empty

        if(row == 1)
        {
            return binarySearch(matrix, 0, 0, col-1, target);
        }

        int rowStart = 0;
        int rowEnd = row-1;
        int colMid = col/2;

        // run the loop till two rows are remaining
        while(rowStart < (rowEnd-1))
        {
            // While this is true it wil have more than 2 rows
            int mid = rowStart + (rowEnd-rowStart)/2;

            if(matrix[mid][colMid] == target)
            {
                return new int[] {mid, colMid};
            }

            if(target < matrix[mid][colMid])
            {
                rowEnd = mid;
            }
            else
            {
                rowStart = mid;
            }
        }

        // Now we have 2 rows 
        // check whether the target is in the col of 2 rows
        if(matrix[rowStart][colMid] == target)
        {
            return new int[] {rowStart, colMid};
        }

        if(matrix[rowStart+1][colMid] == target)
        {
            return new int[] {rowStart+1, colMid};
        }

        // Search in 1st half
        if(target <= matrix[rowStart][colMid-1])
        {
            return binarySearch(matrix, rowStart, 0, colMid-1, target);
        }

        // Search in 2nd half
        if(target >= matrix[rowStart][colMid+1] && target <= matrix[rowStart][col-1])
        {
            return binarySearch(matrix, rowStart, colMid+1, col-1, target);
        } 

        // Search in 3rd half
        if(target <= matrix[rowStart+1][colMid-1])
        {
            return binarySearch(matrix, rowStart+1, 0, colMid-1, target);
        }
        else // Search in 4th half
        {
            return binarySearch(matrix, rowStart+1, colMid+1, col-1, target);
        }
    }

    public static void main(String[] args) 
    {
        int[][] arr = {

            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };

        System.out.println(Arrays.toString(search(arr, 9)));
    }    
}