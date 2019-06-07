package com.Inner_Classes_and_Abstract_Class.Abstract_Class.Abstract_Class_Challenge;

public class MyLinkedList implements NodeList {
    public ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        } else {
            ListItem currentItem = this.root;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(newItem);
                if (comparison < 0) {
                    //newItem is greater, move right if possible
                    if (currentItem.next() != null) {
                        currentItem = currentItem.next();
                    } else {
                        currentItem.setNext(newItem);
                        newItem.setPrevious(currentItem);
                        return true;
                    }
                } else if (comparison > 0) {
                    //newItem is less, insert before
                    if (currentItem.previous() != null) {
                        currentItem.previous().setNext(newItem);
                        newItem.setPrevious(currentItem.previous());
                        newItem.setNext(currentItem);
                        currentItem.setPrevious(newItem);
                    } else {
                        //the node with the previous is the root
                        newItem.setNext(this.root);
                        this.root.setPrevious(newItem);
                        this.root = newItem;
                    }
                    return true;
                } else {
                    //equal
                    System.out.println(newItem.getValue() + " is already present, not added!");
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
