/*
* Greedy Question 
* Fractional Knapsack
* (Different to 0-1 Knapsack -> done by DP)
* 
* Given the weights and value of N items, put these items in 
* a knapsack of capacity W to get the maximum total value in the knapsack.
* 
* Approach -> Weight of the idtem item should be less(so that you can carry as more of other items)
* but the value should be more 
* Basically (Less weight and more value)
* ratio = (value/weight)
*/


import java.util.Arrays;
import java.util.Comparator;

public class problem71 
{
    public static void main(String[] args) 
    {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col -> idx, 1st col -> ratio
        
        for(int i = 0; i < val.length; i++)
        {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalVal = 0;

        for(int i = ratio.length-1; i >= 0; i--)
        {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx])
            {
                // include full item
                finalVal += val[idx];
                capacity -= weight[idx];
            }
            else
            {
                // include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value = "+ finalVal);

    }    
}