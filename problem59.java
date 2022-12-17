/*
 * find the Height of tree
 * Time complixity O(n)
 */

public class problem59 
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

    static class Tree
    {
        static int idx = -1;
        public static Node buildTree(int nodes[])
        {
            problem59 bt = new problem59();
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }

            Node newNode = bt.new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    
    public static int height(Node root)
    {
        if(root == null)
        {
            return 0 ;
        }

        int left = height(root.left);
        int right = height(root.right);

        int myHeight =  (left > right ? left : right) + 1;

        return myHeight;
    }

    public static void main(String[] args) 
    {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree tree = new Tree();
        Node root = tree.buildTree(nodes);

        System.out.println(height(root));
    }    
}