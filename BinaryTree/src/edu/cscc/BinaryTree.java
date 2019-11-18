package edu.cscc;

import java.util.Arrays;

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

public class BinaryTree{

    private int[] elements; // list of values
    private int size;
    public static final int DEFAULT_SIZE = 50;


    public BinaryTree() {
        this(DEFAULT_SIZE);
    }

    public BinaryTree(int arrSize) {
        if (arrSize < 0) {
            throw new IllegalArgumentException("Array Size is less than zero. Size: " + arrSize);
        }
//      elements = (int[]) new Object[arrSize];
        size = elements.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if(size==0){ return true; }
        else{ return false; }
    }

    public void add(int data) {
        if (size < elements.length) {
            elements[size] = data;
        }
        else {
            size = size +1; //Allocate more space
            elements[size] = data;
        }
        size++;
    }
    public boolean exists(int data){
        return false;
    }

    public Integer max(){
        return -1;
    }

    public Integer min(){
        return -1;
    }

}
