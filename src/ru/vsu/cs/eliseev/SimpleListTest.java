package ru.vsu.cs.eliseev;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleListTest {
    @Test
    public void test1() {
        SimpleList test = new SimpleList();

        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);//max
        test.push(-1);
        test.push(4);
        test.push(5);//max
        test.push(5);//max
        test.push(5);//max
        test.push(2);

        assertEquals(4, test.findNumberOfMax());
    }

    @Test
    public void test2() {
        SimpleList test = new SimpleList();

        assertEquals(0, test.findNumberOfMax());
    }

    @Test
    public void test3() {
        SimpleList test = new SimpleList();

        test.push(2);

        assertEquals(1, test.findNumberOfMax());
    }


    @Test
    public void test4() {
        SimpleList test = new SimpleList();

        test.push(2);
        test.push(2);
        test.push(2);
        test.push(2);
        test.push(2);
        test.push(2);
        test.push(2);
        test.push(2);
        test.push(2);

        assertEquals(9, test.findNumberOfMax());
    }
    @Test
    public void test5() {
        SimpleList test = new SimpleList();

        test.push(1);
        test.push(3);//max
        test.push(0);
        test.push(3);//max
        test.push(0);
        test.push(2);
        test.push(0);
        test.push(2);
        test.push(0);
        test.push(2);
        test.push(0);
        test.push(2);
        test.push(0);
        test.push(2);
        test.push(0);
        test.push(2);
        test.push(0);
        test.push(2);
        test.push(0);
        test.push(3);//max

        assertEquals(3, test.findNumberOfMax());
    }


}