public class LL_reverse_irt 
{
    private Node head;
    private Node tail;


    private int size;
    public LL_reverse_irt()
    {
        this.size = 0;
    }


    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

    public void reverse()
    {
        if(size < 2)
        {
            return; 
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null)
        {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null)
            {
                next = next.next;
            }
        }
        head = prev;
    }
    
    public static void main(String[] args) 
    {

    }    
}