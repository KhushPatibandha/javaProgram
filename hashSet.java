import java.util.HashSet;
import java.util.Iterator;

public class hashSet 
{
    public static void main(String[] args) 
    {
        // Creating
        HashSet<Integer> set = new HashSet<>();
        
        // Insert -> add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        
        // Search -> contains
        if(set.contains(1));
        {
            System.out.println("Set contains 1");
        }
        

        // Delete -> remove
        set.remove(1);


        // Size -> .size()
        System.out.println("Size of set is : "+ set.size());
 

        // Print all elements in the set
        System.out.println(set);


        // Iterator -- .next, .hasNext()

        // .next -> it will iterate to the next index in the set
        // .hasNext -> return a boolean value tree if there is a next element after the current element and false if not

        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }    
}