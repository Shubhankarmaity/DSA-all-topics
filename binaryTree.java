import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // preorder traversal
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // Inorder traversal
        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // postorder traversal
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // Level order Traversal
        public static void levelTraversal(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    // height of the tree
    public static int treeHeight(Node root) {
        int height = 0;
        if (root == null) {
            return 0;
        }
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        height = Math.max(leftHeight, rightHeight) + 1;

        return height;
    }

    // count of the nodes
    public static int nodeCount(Node root) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        int leftCount = nodeCount(root.left);
        int rightCount = nodeCount(root.right);
        count = leftCount + rightCount + 1;

        return count;
    }

    // sum of node
    public static int sumNode(Node root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        int leftSum = sumNode(root.left);
        int rightSum = sumNode(root.right);
        sum = leftSum + rightSum + root.data;

        return sum;
    }
    // diameter of the tree
    public static int treeDiameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiam = treeDiameter(root.left);
        int rightDiam = treeDiameter(root.right);
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        int self = (leftHeight + rightHeight + 1);

        return Math.max(Math.max(leftDiam, rightDiam), self);
    }


    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.levelTraversal(root);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println("height of the tree is: " + treeHeight(root));
        System.out.println("count of the nodes is: " + nodeCount(root));
        System.out.println("sum of each node: " + sumNode(root));
        System.out.println("Diameter of the tree is: " + treeDiameter(root));
    }
}
