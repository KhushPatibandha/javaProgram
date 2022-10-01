public class LL_circular 
{
    private Node head;
    private Node tail;

    public LL_circular()
    {
        this.head = null;
        this.tail = null;
    }

    private class Node
    {
        int val;
        Node next;

        public Node(int val)
        {
            this.val = val;
        }
    }

    public void insert(int val)
    {
        Node node = new Node(val);
        if(head == null)
        {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }


    public void delete(int val)
    {
        Node node = head; 
        if(node == null)
        {
            return;
        }

        if(node.val == val)
        {
            head = head.next;
            tail.next = head;
            return;
        }

        do
        {
            Node n = node.next;
            if(n.val == val)
            {
                node.next = n.next;
                break;
            }
            node = node.next;
        }
        while(node != head);
    }


    public void display()
    {
        Node node = head;
        if(head != null)
        {
            do
            {
                System.out.print(node.val +" -> ");
                node = node.next;
            }
            while(node != head);
        }
    }

    public static void main(String[] args) 
    {
        LL_circular list = new LL_circular();

        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.delete(2);
        list.display();
    }    
}
