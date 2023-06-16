import java.util.*;;


public class hashMap_implementation 
{
    static class HashMap<K, V>
    {
        private class Node 
        {
            K key;
            V value;

            public Node(K key, V value)
            {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[]; // N = buckets.length

        public HashMap()
        {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++)
            {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) //cBucketIdx should always be between 0 to N-1
        {
            int bucketIdx = key.hashCode();
            return Math.abs(bucketIdx) % N;
        }

        private int searchInLL(K key, int bucketIdx)
        {
            LinkedList<Node> ll = buckets[bucketIdx];
            int dataIdx = 0;
            for(int i = 0; i < ll.size(); i++)
            {
                if(ll.get(i).key == key)
                {
                    return i; // dataIdx
                }
            }

            return -1;
        }

        private void rehash()
        {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2]; 

            for(int i = 0; i < N*2; i++)
            {
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0; i < oldBucket.length; i++)
            {
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j < ll.size(); j++)
                {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value)
        {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx); // data index

            if(dataIdx == -1) // Key dosen't exists
            {
                buckets[bucketIdx].add(new Node(key, value));
                n++;
            } 
            else // Key exists
            {
                Node node = buckets[bucketIdx].get(dataIdx);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0)
            {
                // rehashing
                rehash();
            }
        }

        public V get(K key)
        {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx); // data index

            if(dataIdx == -1) // Key dosen't exists
            {
                return null;
            } 
            else // Key exists
            {
                Node node = buckets[bucketIdx].get(dataIdx);
                return node.value;
            }
        }

        public boolean containsKey(K key)
        {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx); // data index

            if(dataIdx == -1) // Key dosen't exists
            {
                return false;
            } 
            else // Key exists
            {
                return true;
            }
        }

        public V remove(K key)
        {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx); // data index

            if(dataIdx == -1) // Key dosen't exists
            {
                return null;
            } 
            else // Key exists
            {
                Node node = buckets[bucketIdx].get(dataIdx);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty()
        {
            return n == 0;
        }

        public ArrayList<K> keySet()
        {
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i < buckets.length; i++)
            {
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j < ll.size(); j++)
                {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }
    }

    public static void main(String[] args) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);    
        
        ArrayList<String> keys = map.keySet();
        for(int i = 0; i < keys.size(); i++)
        {
            System.out.println(keys.get(i) +" "+ map.get(keys.get(i)));
        }

        map.remove("China");
        System.out.println(map.get("China"));
    }    
}