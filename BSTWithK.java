/*
- theory at the start. 
- You can insert, remove, find or you can say add or remove stuff in tree in O(logN). 
- ordered storage.
- cost efficient.
*/

public class BSTWithK {
    public BSTWithK() {

    }
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node) {
        if(node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if(node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of "+ node.value +" : ");
        display(node.right, "Right child of "+ node.value +" : ");
    }

    public void insert(int value) {
        root = insert(value, root);
    }
    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }
        if(value < node.value) {
            node.left = insert(value, node.left);
        }
        if(value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }
    private void populateSorted(int[] nums, int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if(node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public static void main(String[] args) {
        BSTWithK tree = new BSTWithK();
        // int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // tree.populate(nums);
        tree.populateSorted(nums);
        tree.display();
    }
}