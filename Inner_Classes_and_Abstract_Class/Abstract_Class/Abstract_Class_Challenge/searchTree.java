package com.Inner_Classes_and_Abstract_Class.Abstract_Class.Abstract_Class_Challenge;

import java.util.List;

public class searchTree implements NodeList {
    private ListItem root = null;

    public searchTree(ListItem root) {
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
                        return true;
                    }
                } else if (comparison > 0) {
                    //newItem is less, insert before
                    if (currentItem.previous() != null) {
                        currentItem = currentItem.previous();
                    } else {
                        //newItem is less, move to the left of possible
                        currentItem.setPrevious(newItem);
                        return true;
                    }
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
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                //equal
                performRemoval(currentItem, parentItem);
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftmostParent == item) {
                item.setNext(current.next());
            } else {
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        //its a recursive method
        if (root !=  null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
