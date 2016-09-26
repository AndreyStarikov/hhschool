package org.andreystarikov;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 23.09.2016.
 */
public class IntUtilTest {
    @Test
    public void testGetReverseList() throws Exception {
        ArrayList a = new ArrayList();
        for (int i = 0; i < 5; i++) {
            a.add(i);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
        System.out.println();
        ArrayList b = IntUtil.getReverseList(a);
        for (int i = 0; i < b.size(); i++) {
            System.out.print(b.get(i));
        }
        System.out.println();
    }

    @Test
    public void testListCompare() throws Exception {
        ArrayList a = new ArrayList();
        for (int i = 0; i < 5; i++) {
            a.add(i);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
        System.out.println();
        ArrayList b = new ArrayList(a);
        assertEquals("Получилось", true, IntUtil.listCompare(a, b));
    }

    @Test
    public void testListCompareReverse() throws Exception {
        ArrayList a = new ArrayList();
        for (int i = 0; i < 5; i++) {
            a.add(i);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
        System.out.println();
        ArrayList b = IntUtil.getReverseList(a);
        assertEquals("Получилось", false, IntUtil.listCompare(a, b));
    }

    @Test
    public void testAddition1() throws Exception {
        ArrayList a = new ArrayList();
        for (int i = 0; i < 5; i++) {
            a.add(i);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
        System.out.println();
        ArrayList b = IntUtil.getReverseList(a);
        for (int i = 0; i < b.size(); i++) {
            System.out.print(b.get(i));
        }
        System.out.println();
        a = IntUtil.addition(a, b);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
        System.out.println();
    }

    @Test
    public void testAddition2() throws Exception {
        ArrayList a = new ArrayList();
        a.add(8);
        for (int i = 0; i < 5; i++) {
            a.add(i + 3);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
        System.out.println();

        ArrayList b = new ArrayList();
        b.add(8);
        for (int i = 0; i < 5; i++) {
            b.add(i + 5);
        }
        for (int i = 0; i < b.size(); i++) {
            System.out.print(b.get(i));
        }
        System.out.println();
        a = IntUtil.addition(a, b);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
        System.out.println();
    }

    @Test
    public void testGetArrayListFromInt() throws Exception {
        ArrayList a = IntUtil.getArrayListFromInt(65654);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
    }
}