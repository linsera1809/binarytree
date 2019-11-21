package edu.cscc;

/**
 * @author Bobby Linse
 * Date: November 2019
 * Instructor: David Palzer
 * School: Columbus State Community College
 * Assignment: Lab #2
 *
 * Description: This class is dedicated to the Java II assignment which
 * is to write a generic 'edu.cscc.ArrayList' class similar to the one in the given
 * lecture notes on array lists.
 */

public class BinaryTree {

    public static class Node { //local inner class
        int data;
        Node lNode;
        Node rNode;

        //Constructor
        public Node(int item) {
            data = item;
            lNode = null;
            rNode = null;
        }
    }

    Node head;
    int size;

        public int size() {
            return this.size;
        }

        public boolean isEmpty() {
            return (size() == 0);
        }


        public void add(int value) {
            if (head == null) {
                Node first = new Node(1);
                first.data = value;
            } else {
                add(value, head);
                size++;
            }
        }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void add(int value, Node node) {
            if (value > node.data) {
                if (node.rNode == null) {
                    node.rNode = new Node(value);
                } else {
                    add(value, node.rNode);
                }

            } else if (value <= node.data) {
                if (node.lNode == null) {
                    node.lNode = new Node(value);
                } else {
                    add(value, node.lNode);
                }
            }
        }

        public boolean exists(int value) {
            return exists(value, head);
        }

        private boolean exists(int value, Node node) {
            if (node == null) {
                return false;
            }
            else if (value == node.data) {
                return true;
            }
            else if (value > node.data) {
                return exists(value, node.rNode);
            }
            else if (value < node.data) {
                return exists(value, node.rNode);
            }
            else {
                return false;
            }
        }

        public Integer max() {
            Node currentHead = head;

            if (currentHead == null) {
                return -1;
            } else {
                while (currentHead.rNode != null) {
                    currentHead = currentHead.rNode;
                }
                return currentHead.data;
            }
        }

        public Integer min() {
            Node currentHead = head;

            if (currentHead == null) {
                return -1;
            } else {
                while (currentHead.lNode != null) {
                    currentHead = currentHead.rNode;
                }
                return currentHead.data;
            }
        }

    @Override
    public String toString() {
        return super.toString();
    }
}