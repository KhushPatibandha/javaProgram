/*
 * Greedy Question
 * Indian Coins
 * 
 * We are given an infinite supply of denominations.
 * Find min no of coins/notes to make change of a value V
 * 
 * Approch -> First sort then start checking for the values 
 * Give the maximum value then give the rest 
 * 
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class problem74 
{
    public static void main(String[] args) 
    {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < coins.length; i++)
        {
            if(coins[i] <= amount)
            {
                while(coins[i] <= amount)
                {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("total (min) coins used = "+ countOfCoins);

        for(int i = 0; i < ans.size(); i++)
        {
            System.out.print(ans.get(i) +" ");
        }
        System.out.println();
    }    
}