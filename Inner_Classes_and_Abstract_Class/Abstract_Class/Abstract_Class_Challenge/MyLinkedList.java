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
                        //line 29 and 30 combined in one line as currentItem.setNext(newItem).setPrevious(currentItem);
                        return true;
                    }
                } else if (comparison > 0) {
                    //newItem is less, insert before
                    if (currentItem.previous() != null) {
                        currentItem.previous().setNext(newItem);
                        newItem.setPrevious(currentItem.previous());
                        newItem.setNext(currentItem);
                        currentItem.setPrevious(newItem);
                        //line 39 and 40 combined in one line as newItem.setNext(currentItem).setPrevious(newItem);
                    } else {
                        //the node with the previous is the root
                        newItem.setNext(this.root);
                        this.root.setPrevious(newItem);
                        //line 44 and 45 combined in one line as newItem.setNext(this.root).setPrevious(newItem);
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
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { //comparison is greater than 0
                //We are at an item greater than the one to be deleted
                //So the item is not in the list
                return false;
            }
        }
        //We have reached the end of the list without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
