package org.andreystarikov;

/**
 * Created by Andrey on 22.09.2016.
 */
public class Spiral {

    public int sumOfDiagonals(int side) {
        int sum = 0;
        if (side > 0) {
            int number = 1;
            sum = number;
            for (int i = 2; i <= side - 1; i += 2) {
                for (int j = 0; j < 4; j++) {
                    number += i;
                    sum = sum + number;
                }
            }
        }
        return sum;
    }
}
