package com.Inner_Classes_and_Abstract_Class.Abstract_Class.Abstract_Class_Challenge;

public class AC_main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        //create a string data array to avoid typing loads of addItem instructions
        String stringData = "5 7 6 3 2 4 1 9 8 0";
        String[] data = stringData.split(" ");
        for (String s:
             data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());

        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
    }
}
