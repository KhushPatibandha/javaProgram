/*
 * Search in BinarySearchTree(BST)
 * 
 * Find if the given key exist in the tree
 * 
 * Time complixity O(H) == O(Height)
 * 
 */

 
public class problem62 
{
    public class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }


    public static Node insert(Node root, int val)
    {
        problem62 bst = new problem62();

        if(root == null)
        {
            root = bst.new Node(val);
            return root;
        }

        if(root.data > val)
        {
            root.left = insert(root.left, val);
        }
        else
        {
            root.right = insert(root.right, val);
        }

        return root;
    }


    public static boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data > key)
        {
            return search(root.left, key);
        }

        else if(root.data == key)
        {
            return true;
        }

        else
        {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) 
    {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++)
        {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if(search(root, 1))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }    
}