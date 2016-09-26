package org.andreystarikov;

import java.util.Arrays;

/**
 * Created by Andrey on 21.09.2016.
 */

public class DigitPermutation {

    private int a;
    private int b;

    public DigitPermutation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getX() {
        int x = 0;
        boolean flag = true;
        while (flag) {
            x++;
            int firstNumber = a * x;
            int secondNumber = b * x;
            int[] firstArray = IntUtil.getArrayFromInt(firstNumber);
            int[] secondArray = IntUtil.getArrayFromInt(secondNumber);
            if (firstArray.length == secondArray.length) {
                InsertionSort.insertionSort(firstArray);
                InsertionSort.insertionSort(secondArray);
                flag = !Arrays.equals(firstArray, secondArray);
            }
        }
        return x;
    }

}
