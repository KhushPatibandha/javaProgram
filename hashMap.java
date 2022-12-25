import java.util.*;

public class hashMap 
{
    public static void main(String[] args) 
    {
        // Country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();
        

        // Insert -> .put()
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180); // Will updates the value if the value already exists
        System.out.println(map);


        // Search -> .containsKey, get
        // (i) .containsKey - return a boolean value true if the key exists and false if not
        // (ii) .get - gives value of the key inserted 

        if(map.containsKey("China"))
        {
            System.out.println("Key is present in the map");
        }
        else
        {
            System.out.println("Key in not present in the map");
        }

        System.out.println(map.get("China")); // Key exists
        System.out.println(map.get("UK")); // Key dosen't exists


        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            System.out.println(key +" "+ map.get(key));
        }


        // Delete -> .remove - removes the key and the value to it
        map.remove("China");
        System.out.println(map);
    }    
}