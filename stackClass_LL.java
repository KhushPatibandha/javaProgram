public class stackClass_LL 
{
    static class Node
    {
        int date;
        Node next;

        public Node(int date)
        {
            this.date = date;
            next = null;
        }
    }

    static class Stack
    {
        public static Node head;
        public static boolean isEmpty()
        {
            return head == null;
        }
        

        public static void push(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = head.date;
            head = head.next;
            return top;
        }


        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.date;
        }
    }
    public static void main(String[] args) 
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }    
}