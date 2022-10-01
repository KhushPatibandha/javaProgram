
public class linkList_2 
{
    private Node head;
    private Node tail;


    private int size;
    public linkList_2()
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

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val)
    {   
        if(tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node; 
        tail = node;
        size++;
    }

    public void insert(int val, int idx)
    {
        if(idx == 0)
        {
            insertFirst(val);
            return;
        }
        if(idx == size)
        {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < idx; i++)
        {
            temp = temp.next;
        }
        
        Node node = new Node(val, temp.next);
        temp.next = node;
        
        size++;
    }

    // insert using recursion 

    public void insertRec(int val, int idx)
    {
        head = insertRec(val, idx, head);
    }

    private Node insertRec(int val, int idx, Node node)
    {
        if(idx == 0)
        {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, idx--, node.next);
        return node;
    }


    public int deleteFirst()
    {
        int val = head.value;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int idx)
    {
        Node node = head;
        for(int i = 0; i < idx; i++)
        {
            node = node.next;
        }
        return node;
    }

    public int deleteLast()
    {
        if(size <= 1)
        {
            return deleteFirst();
        }

        Node secondLast = get(size-2); 
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int idx)
    {
        if(idx == 0)
        {
            return deleteFirst();
        }
        if(idx == size-1)
        {
            return deleteLast();
        }

        Node perv = get(idx-1);
        int val = perv.next.value;

        perv.next = perv.next.next;
        return val;
    }

    public Node find(int value)
    {
        Node node = head;
        while(node != null)
        {
           if(node.value == value)
           {
            return node;
           } 
           node = node.next;
        }
        return null;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) 
    {
        linkList_2 LL = new linkList_2();

        LL.insertFirst(1);
        LL.insertFirst(2);
        LL.insertFirst(3);
        LL.insertFirst(4);

        // LL.insertLast(0);

        // LL.insert(9, 3);
        // LL.display();
        
        // System.out.println(LL.deleteFirst());
        // LL.display();

        // System.out.println(LL.deleteLast());
        // LL.display();
    
        // System.out.println(LL.delete(2));
        // LL.display(); 

        LL.insertRec(88, 1);
        LL.display();
    }
}