/*
* Greedy Question 
* Max length Chain of pairs
* 
* Very very similar to activity selection question (problem70)
* 
* Approch -> just sort the end array 
* 
*/


import java.util.Arrays;
import java.util.Comparator;

public class problem73 
{
    public static void main(String[] args) 
    {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1]; // Last selected pair end 

        for(int i = 1; i < pairs.length; i++)
        {
            if(pairs[i][0] > chainEnd)
            {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Max length of chain = "+ chainLength);
    }    
}