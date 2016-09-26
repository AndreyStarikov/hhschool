package org.andreystarikov;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 22.09.2016.
 */
public class SpiralTest {

    @Test
    public void sumOfDiagonals() throws Exception {
        assertEquals("Получаем", 101, Spiral.sumOfDiagonals(5));
    }

    @Test
    public void sumOfDiagonals2() throws Exception {
        assertEquals("Получаем", 693520565, Spiral.sumOfDiagonals(1013));
    }
}