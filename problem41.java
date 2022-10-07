// Place tiles of size 1xm in a floor of size nxm
// ********************************

public class problem41 
{
    public static int placeTiles(int n, int m)
    {
        if(n < m)
        {
            return 1;
        }

        if(n == m)
        {
            return 2;
        }

        // vertically
        int verticalPLacements = placeTiles(n-m, m);

        // horizentally
        int horizentalPlacements = placeTiles(n-1, m);

        return verticalPLacements + horizentalPlacements;
    } 
    public static void main(String[] args) 
    {
        int n = 4;
        int m = 2;
        System.out.println(placeTiles(n, m));
    }    
}
