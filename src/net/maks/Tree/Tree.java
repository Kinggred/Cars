package net.maks.Tree;

import java.util.Comparator;

public class Tree {
    private Node root;
    private Comparator comparator;

    public Tree(Comparator comparator) {
        this.root = null;
        this.comparator = comparator;
    }

    public Node add(Object value){
        Node node = new Node(value);

        if(this.root == null) {
            this.root = node;
            return node;
        }
        return add(node, this.root);
    }

    private Node add(Node current, Node parent) {
        if(comparator.compare(parent.value, current.value) < 0) {
            if (parent.left == null) {
                parent.left = current;
                return current;
            }
            return add(current, parent.left);
        } else if (comparator.compare(parent.value, current.value) == 0) {
           return if_middle(current, parent);
        } else if (comparator.compare(parent.value, current.value) > 0) {
            if (parent.right == null) {
                parent.right = current;
                return current;
            }
            return add(current, parent.right);
        }
        return null;
    }
    protected Node if_middle(Node current, Node parent) {
        if (parent.middle == null) {
            parent.middle = current;
            return current;
        }
        return if_middle(current, parent.middle);
    }
    public void display() {
        display(this.root);
        System.out.println();
    }
    private void display(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            display(root.left);
            display(root.middle);
            display(root.right);
        }
    }

    public void displayAsc() {
        displayAsc(this.root);
        System.out.println();
    }
    private void displayAsc(Node root) {
        if (root != null) {
            displayAsc(root.left);
            System.out.print(root.value + " ");
            display_middle(root.middle);
            displayAsc(root.right);
        }
    }

    public void displayDsc() {
        displayDsc(this.root);
        System.out.println();
    }
    private void displayDsc(Node root) {
        if (root != null) {
            displayDsc(root.right);
            System.out.print(root.value + " ");
            display_middle(root);
            displayDsc(root.left);
        }
    }
    private void display_middle(Node node) {
        if (node != null) {
            display_middle(root.middle);
            System.out.print(root.value + " ");
        }
    }
}
