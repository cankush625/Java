package com.Inner_Classes_and_Abstract_Class.Abstract_Class.Abstract_Class_Challenge;

public class searchTree_main {
    public static void main(String[] args) {
        searchTree tree = new searchTree(null);
        tree.traverse(tree.getRoot());

        //create a string data array to avoid typing loads of addItem instructions
        String stringData = "5 7 6 3 2 4 1 9 8 0";
        String[] data = stringData.split(" ");
        for (String s:
                data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
    }
}
