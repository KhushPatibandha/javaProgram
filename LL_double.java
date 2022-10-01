public class LL_double 
{
    private Node head;

    private class Node
    {
        int val;
        Node next;
        Node perv;

        public Node(int val)
        {
            this.val = val;
        }

        // public Node(int val, Node next, Node perv)
        // {
        //     this.val = val;
        //     this.next = next;
        //     this.perv = perv;
        // }
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        node.perv = null;
        
        if(head != null)
        {
            head.perv = node;
        }

        head = node;
    }    

    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head == null)
        {
            node.perv = null;
            head = node;
            return;
        }

        while(last.next != null)        
        {
            last = last.next;
        }

        last.next = node;
        node.perv = last;
    }


    public Node find(int value)
    {
        Node node = head;
        while(node != null)
        {
           if(node.val == value)
           {
            return node;
           } 
           node = node.next;
        }
        return null;
    }

    public void insert(int after, int val)
    {
        Node p = find(after);

        if(p == null)
        {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.perv = p;

        if(node.next != null)
        {
            node.next.perv = node;
        }
    }

    public void display()
    {
        Node node = head;
        Node last = null;

        while(node != null)
        {
            System.out.print(node.val +" -> ");
            last = node;
            node = node.next;
        }
        System.out.println("NULL");

        System.out.println("Print in reverse");
        while(last != null)
        {
            System.out.print(last.val +" -> ");
            last = last.perv;
        }
        System.out.println("START");
    }


    public static void main(String[] args) 
    {
        LL_double list = new LL_double();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

        list.insertLast(0);

        list.insert(5, 9);
        list.display();
    }    
}
