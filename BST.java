import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // for search a key
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        } else if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Delete Node
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data == val) {
            // case-1 no leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case-2 single child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case-3 two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // print range node
    public static void printRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printRange(root.left, k1, k2);
        } else {
            printRange(root.right, k1, k2);
        }
    }

    // root to leaf paths
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    // Valid BST
    public static boolean isValid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }  
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }

    //Mirror BST
    public static Node mirrorBST(Node root){
        if(root==null){
            return null;
        }
        Node leftS=mirrorBST(root.left);
        Node rightS=mirrorBST(root.right);

        root.left=rightS;
        root.right=leftS;

        return root;
    }
    //for print preorder
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //Balanced BST
    public static Node createBSt(int arr[],int st,int end){

        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBSt(arr,st,mid-1);
        root.right=createBSt(arr, mid+1, end);

        return root;
    }

    //
    public static void main(String[] args) {
        // int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        // Node root = null;
        // for (int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }
        // // inorder(root);
        // System.out.println();
        
        // System.out.print(search(root, 10));

        // root=delete(root, 1);
        // System.out.println();

        // inorder(root);
        // printRange(root, 5, 12);
        // printRoot2Leaf(root, new ArrayList<>());

        // if (isValid(root, null, null)) {
        //     System.out.print("valid BST");
        // } else {
        //     System.out.print("Not valid BST");
        // }

        // preorder(root);
        
        // int arr[]={3,5,6,8,10,11,12};
        // int st=0;
        // int end=arr.length-1;
        // root=createBSt(arr, st,end);
        // preorder(root);

    }
}
