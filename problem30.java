// Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
// time complexity =  O(2^n - 1) === O(2^n)
// ****************************************


public class problem30 
{
    public static void towerOfHanoi(int n, String src, String helper, String dest)
    {
        if(n == 1)
        {
            System.out.println("Transfer disk "+ n +" from "+ src +" to "+ dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+ n +" from "+ src +" to "+ dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) 
    {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }   
}

