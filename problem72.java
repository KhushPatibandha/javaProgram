/*
 * Greedy problem
 * Min Absolute Difference Pairs
 * 
 * Given two arrays A and B of equal length n. Pair each element of
 * array A to an element in array B, such that sum S of absoulte difference of all the pairs is minimum
 * 
 * Approch -> Sort 2 arrays and then compair to find the abs min
 * 
 * Time complixity -- O(nlogn)
 */


import java.util.Arrays;

public class problem72 
{
    public static void main(String[] args) 
    {
        int a[] = {1, 8, 4, 7};
        int b[] = {2, 6, 3, 5};
        
        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff = 0;

        for(int i = 0; i < a.length; i++)
        {
            minDiff += Math.abs(a[i] - b[i]);
        }

        System.out.println("Min absolute diff of pairs = "+ minDiff);
    }    
}