/*
 * Find the Diameter of a tree
 * 
 * Now the diameter of the tree means the ("Number of nodes in the 
 * longest path between any 2 nodes")
 * 
 * 
 * Now there are 2 CASES but which we can solve this 
 * 
 * 
 * Case 1 : Longest path passing through root node
 * Case 2 : Longest path not passing through root node 
 * 
 * 
 * Approach 1 : Time complixity O(N^2)
 * (i) Find the diameter of the left subtree 
 * (ii) find the diameter of the right subtree
 * (iii) find the diameter of left and right subtree and add 1(root) to it 
 * at the end just find the max out of it and that is the answer
 * 
 * 
 * Approach 2 : Time complixity O(N)
 * Main mistake in approch 1 was that we calculated diameter and then
 * afterward we calculated the height, what we should have done was
 * to calculate the diameter and height at the same time 
 * 
 * 
 * ****************************************************
 */

public class problem60 
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
            problem60 bt = new problem60();
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

    public static int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    } 

    static class TreeInfo
    {
        int height;
        int diameter;

        TreeInfo(int height, int diameter)
        {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter2(Node root)
    {
        if(root == null)
        {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = (left.height > right.height ? left.height : right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;

        int myDiameter = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiameter);
        return myInfo;
    }

    public static void main(String[] args) 
    {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree tree = new Tree();
        Node root = tree.buildTree(nodes);

        System.out.println(diameter(root));
        System.out.println(diameter2(root).diameter);
    }    
}