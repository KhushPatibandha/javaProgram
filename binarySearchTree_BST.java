/*
 * Build a BinarySearchTree(BST)
 * Time complixity is O(H) == O(Height)
 * 
 * problem62 and problem63 are some application of binarySearchTree(BST) 
 * problem62 -- find if the given key by the user exist in the binarySearchTree(BST)
 * problem63 -- Delete a node in a BinarySearchTree(BST)
 * 
 */


public class binarySearchTree_BST 
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

    public static Node insert(Node root, int val)
    {
        binarySearchTree_BST bst = new binarySearchTree_BST();

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
    
    public static void main(String[] args) 
    {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i = 0; i < values.length; i++)
        {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();
    }    
}