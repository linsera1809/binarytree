package edu.cscc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;


/**
 * Test cases for the {@link BinaryTree} class.
 *
 */
public final class BinaryTreeTest {

    private static ArrayList aList50 = new ArrayList(50);
    private static ArrayList aList25 = new ArrayList(25);
    private static ArrayList aList10 = new ArrayList(10);
    private static ArrayList aList5 = new ArrayList(5);
    private static ArrayList aList0 = new ArrayList(0);


    @Test
    public void size() {
        ArrayList list = new ArrayList();
        assertEquals("Default Size Check",aList50.size(),list.size());
        assertEquals("Size is 50",50, aList50.size());
        assertEquals("Size is 25",25, aList25.size());
        assertEquals("Size is 10",10, aList10.size());
        assertEquals("Size is 5",5, aList5.size());
        assertEquals("Size is 0",0, aList0.size());
    }

    @Test
    public void isEmpty() {
        ArrayList list = new ArrayList();
        assertTrue("Empty before cleared", aList0.isEmpty());
        aList0.clear();
        aList5.clear();
        aList10.clear();
        aList25.clear();
        aList50.clear();
        list.clear();
        assertTrue("Empty when cleared - 0", aList0.isEmpty());
        assertTrue("Empty when cleared - 5", aList5.isEmpty());
        assertTrue("Empty when cleared - 10", aList10.isEmpty());
        assertTrue("Empty when cleared - 25", aList25.isEmpty());
        assertTrue("Empty when cleared - 50", aList50.isEmpty());
        assertTrue("Empty when cleared - Default", list.isEmpty());
    }

    //Failing
    @Test
    public void add() {
        ArrayList list = new ArrayList();
        Object o = "Hello";

        list.add(o);
        assertEquals("Object added", false, list.isEmpty());

        aList0.add(2, o);
        assertEquals("Object added", false, aList0.isEmpty());

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