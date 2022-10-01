// import java.util.*;;

// linkList from scratch --- addFirst, addLast, deleteFirst
//                           deleteLast, print, getSize,
//                           reverseIterate, reverseRecursive

public class linkList
{
    node head;
    private int size;

    linkList()
    {
        this.size = 0;
    }
    class node
    {
        String data;
        node next;

        node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first
    public void addFirst(String data)
    {
        node newNode = new node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add - last
    public void addLast(String data)
    {
        node newNode = new node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print
    public void printList()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete - first
    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete - last
    public void deleteLast()
    {
       if(head == null)
       {
            System.out.println("the list is empty");
            return;
       } 
       size--;
       if(head.next == null)
       {
        head = null;
        return;
       }

       node secondLast = head;
       node lastNode = head.next;
       while(lastNode.next != null)
       {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
       }
       
       secondLast.next = null;
    }

    // size
    public int getSize()
    {
        return size;
    }

    // reverse - iterate
    public void reverseIterate()
    {
        if(head == null || head.next == null)
        {
            return;
        }
        node prevNode = head;
        node currNode = head.next;

        while(currNode != null)
        {
            node nextNode = currNode.next;
            currNode.next = prevNode;

            // update 
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // reverse - recursive
    public node reverseRecursive(node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }

    public static void main(String[] args) 
    {
        linkList list = new linkList();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("this");
        // list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // System.out.println(list.getSize());

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
