package org.andreystarikov;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 22.09.2016.
 */
public class SpiralTest {

    @Test
    public void sumOfDiagonals() throws Exception {
        Spiral spiral = new Spiral();
        System.out.println(spiral.sumOfDiagonals(5));
    }

    @Test
    public void sumOfDiagonals2() throws Exception {
        Spiral spiral = new Spiral();
        System.out.println(spiral.sumOfDiagonals(1013));
    }
}