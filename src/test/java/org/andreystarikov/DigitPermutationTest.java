package org.andreystarikov;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 21.09.2016.
 */
public class DigitPermutationTest {
    @Test
    public void testDigitPermutation() {
        int a = 3;
        int b = 6;
        DigitPermutation dp = new DigitPermutation(a, b);
//        assertEquals("Получаем", 0, dp.getX());
        System.out.println(dp.getX());
    }
}