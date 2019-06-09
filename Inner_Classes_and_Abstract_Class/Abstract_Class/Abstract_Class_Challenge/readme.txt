NodeList.java is the interface.
ListItem.java is the abstract class.
In the Node.java class I have implemented the node methods like next(), setNext(), previous(), setPrevious().
In the MyLinkedList.java I have implemented the methods to add itme, remove item and traverse item methods for
the linked list.
AC_main.java is the main method to run all the stuff.

Also, the same code by using Binary Search Tree is implemented :
searchTree.java is the class where add item, remove item and traverse methods are written.
searchTree_main.java is the main class to run all the stuff using Binary Search Tree.

Note : 
We are using recursive method for traversing the records in code using BST but we are not using recursive traversing
in the code using linked list. Because, in the normal program using linked list, if we use recursive traversing it 
may crash our program for increasing number of records.