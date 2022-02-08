package collectionExamples;

class Tree {
    int num;
    Tree left, right;

    Tree(int n) {
        num = n;
        left = null;
        right = null;
    }

}

public class BinaryTree {
    public static void main(String[] args) {
        Tree top = new Tree(5);
        Tree four = new Tree(4);
        Tree seven = new Tree(7);
        top.left = four;
        top.right = seven;
        Tree three = new Tree(3);
        four.left = three;
        Tree one = new Tree(1);
        Tree two = new Tree(2);
        three.left = one;
        three.right = two;
        Tree six = new Tree(6);
        seven.left = six;
        System.out.println("Preorder Tree");
        displayTreePreOrder(top);
        System.out.println("\nPostorder Tree");
        displayTreePostOrder(top);
        System.out.println("\nInorder Tree");
        displayTreeInOrder(top);
        System.out.println("\nTotal no. of leaf node : " + countLeafNode(top));
    }

    private static int countLeafNode(Tree top) {
        if(top==null){
            return 0;
        }
        if (top.left == null && top.right == null) {
            return 1;
        } else {
            return countLeafNode(top.left) + countLeafNode(top.right);
        }
    }

    private static void displayTreeInOrder(Tree top) {
        if (top.left != null) {
            displayTreeInOrder(top.left);
        }
        System.out.print(top.num + "->");
        if (top.right != null) {
            displayTreeInOrder(top.right);
        }
    }

    private static void displayTreePostOrder(Tree top) {
        if (top.left != null) {
            displayTreePostOrder(top.left);
        }
        if (top.right != null) {
            displayTreePostOrder(top.right);
        }
        System.out.print(top.num + "->");
    }

    private static void displayTreePreOrder(Tree top) {
        System.out.print(top.num + "->");
        if (top.left != null) {
            displayTreePreOrder(top.left);
        }
        if (top.right != null) {
            displayTreePreOrder(top.right);
        }
    }
}
