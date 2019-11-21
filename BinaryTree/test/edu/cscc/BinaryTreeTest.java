package edu.cscc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;


/**
 * Test cases for the {@link BinaryTree} class.
 *
 */
public final class BinaryTreeTest {

    BinaryTree a = new BinaryTree();
    BinaryTree.Node n = new BinaryTree.Node(1);
    BinaryTree.Node head = a.getHead();
    int size = a.getSize();

    @Test
    public void size() {
        assertEquals(0, a.size());
        assertEquals(0, size);
    }

    @Test
    public void isEmpty() {
    }

    //Failing
    @Test
    public void add() {
    }


    @Test
    public void exists() {
    }

    @Test
    public void max() {
    }

    @Test
    public void min() {
    }
}