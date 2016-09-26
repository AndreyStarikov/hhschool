package org.andreystarikov;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 23.09.2016.
 */
public class EquationTest {
    @Test
    public void getCount() throws Exception {
        Equation e = new Equation("aba", "aacd", "acce");
        assertEquals("Получаем", 40, e.getCount());
//        System.out.println(e.getCount());
    }
    @Test
    public void getCount2() throws Exception {
        Equation e = new Equation("abc", "cde", "ded");
        assertEquals("Получаем", 28, e.getCount());
//        System.out.println(e.getCount());
    }
    @Test
    public void getCount3() throws Exception {
        Equation e = new Equation("abcb", "add", "aecb");
        assertEquals("Получаем", 450, e.getCount());
//        System.out.println(e.getCount());
    }

}