/*
 * Sum of nodes at kth level
 * 
 * do it with level order traversal 
 * here k indicates a level 
 * we just need to find the kth level and return the sum of all the value of the nodes in that level
 * 
 * ******************
 */

import java.util.LinkedList;
import java.util.Queue;

public class problem61 
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
            problem61 bt = new problem61();
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

    public static int sumAtK(Node root, int k)
    {
        if(root == null)
        {
            return -1;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 0;
        int sum = 0;

        while(!q.isEmpty())
        {
            Node currNode = q.remove();

            if(currNode == null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                    level++;
                }
            }
            else
            {
                if(level == k)
                {
                    sum += currNode.data;
                }

                if(currNode.left != null)
                {
                    q.add(currNode.left);
                }

                if(currNode.right != null)
                {
                    q.add(currNode.right);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) 
    {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree tree = new Tree();
        Node root = tree.buildTree(nodes);
        
        System.out.println(sumAtK(root, 2));
    }    
}