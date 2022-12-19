/*
 * Root to leaf Paths
 */

import java.util.ArrayList;

public class problem65 
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
        System.out.println(root.data +" ");
        inOrder(root.right);
    }

    public static Node insert(Node root, int val)
    {
        problem65 bst = new problem65();

        if(root == null)
        {
            root = bst.new Node(val);
            return root;
        }

        if(root.data > val)
        {
            root.left = insert(root.left, val);
        }
        if(root.data < val)
        {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void printPath(ArrayList<Integer> path)
    {
        for(int i = 0; i < path.size(); i++)
        {
            System.out.print(path.get(i) +"->");
        }
        System.out.println();
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path)
    {
        if(root == null)
        {
            return;
        }

        path.add(root.data);

        // Leaf
        if(root.left == null && root.right == null)
        {
            printPath(path);
        }
        else // Non-leaf
        {
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }

        path.remove(path.size()-1);
    }
    
    public static void main(String[] args) 
    {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++)
        {
            root = insert(root, values[i]);
        }

        rootToLeaf(root, new ArrayList<>());
    }    
}