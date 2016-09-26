package org.andreystarikov;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 21.09.2016.
 */
public class MagicSequenceTest {

    @Test
    public void testMagicCounter0() {
        int min = 46991;
        int max = min;
        int magicSum = 10;
        MagicSequence ms = new MagicSequence(min, max, magicSum);
        assertEquals("Получаем", 0, ms.magicCounter());
    }

    @Test
    public void testMagicCounter1() {
        int min = 469191;
        int max = min;
        int magicSum = 10;
        MagicSequence ms = new MagicSequence(min, max, magicSum);
        assertEquals("Получаем", 1, ms.magicCounter());
    }

    @Test
    public void testMagicCounter2() {
        int min = 1;
        int max = 100;
        int magicSum = 10;
        MagicSequence ms = new MagicSequence(min, max, magicSum);
        assertEquals("Получаем", 9, ms.magicCounter());
    }

    @Test
    public void testMagicCounter3() {
        int min = 1;
        int max = 5400000;
        int magicSum = 10;
        MagicSequence ms = new MagicSequence(min, max, magicSum);
        assertEquals("Получаем", 113864, ms.magicCounter());
    }

    @Test
    public void testMagicCounter4() {
        int min = 1;
        int max = 9000000;
        int magicSum = 10;
        MagicSequence ms = new MagicSequence(min, max, magicSum);
        assertEquals("Получаем", 151265, ms.magicCounter());
    }

    @Test
    public void testMagicCounter5() {
        int min = 1;
        int max = 2100000;
        int magicSum = 10;
        MagicSequence ms = new MagicSequence(min, max, magicSum);
        System.out.println(ms.magicCounter());
    }
}