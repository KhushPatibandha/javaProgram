public class LL_reverse_rec 
{
    private Node head;
    private Node tail;


    private int size;
    public LL_reverse_rec()
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

    private void reverse(Node node)
    {
        if(node == tail)
        {
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) 
    {
        
    }    
}