package net.maks.Tree;

public class Node {
    Object value;
    Node left;
    Node middle;
    Node right;

    public Node(Object value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
