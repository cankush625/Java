package com.Inner_Classes_and_Abstract_Class.Abstract_Class.Abstract_Class_Challenge;

public interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
