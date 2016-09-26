package org.andreystarikov;

/**
 * Created by Andrey on 15.09.2016.
 */
public class MagicSequence {

    private int max;
    private int min;
    private int magicSum;
    private int count;
    private int[] array;
    private int positionToIncrement;
    private int arrayLength;


    public MagicSequence(int min, int max, int magicSum) {
        //TODO влепить проверку на min < max
        this.max = max;
        this.min = min;
        this.magicSum = magicSum;

        arrayLength = IntUtil.stringSize(max);
        arrayInit();
        positionToIncrement = arrayLength - 1;
    }

    public int magicCounter() {
        int nextNumber = min;
        while (nextNumber <= max) {
            if (isMagic(array)) {
//                System.out.println(nextNumber);
                count++;
            }
            increment();
            nextNumber = arrayToInt();
        }
        return count;
    }

    private void increment() {
        while (array[positionToIncrement] == 9 && positionToIncrement > 0) {
            positionToIncrement--;
        }
        array[positionToIncrement]++;
        for (int i = positionToIncrement + 1; i < arrayLength; i++) {
            array[i] = 0;
        }
        positionToIncrement = arrayLength - 1;
    }

    private int arrayToInt() {
        int result = 0;
        int length = arrayLength - 1;
        for (int i = 0; i <= length; i++) {
            result = (int) (result + array[length - i] * Math.pow(10, i));
        }
        return result;
    }

    private boolean isMagic(int[] array) {
        int sum = 0;
        int positionOfMagic = -1;
        int begin = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum = sum + array[i];
            if (sum > magicSum) {
                while (sum > magicSum) {
                    if (positionOfMagic == -1 || begin > positionOfMagic) {
                        positionToIncrement = i - 1; //следующее число будет получено инкрементом разряда (i - 1)
                        return false;
                    }
                    sum -= array[begin];
                    begin++;
                }
            }
            if (sum == magicSum) {
                while (i < arrayLength - 1 && array[i + 1] == 0) i++;
                positionOfMagic = i;
            }
        }
        return positionOfMagic == arrayLength - 1;
    }

    private boolean arrayInit() {
        array = new int[arrayLength];
        int a = min;
        for (int i = arrayLength - 1; i >= 0; i--) {
            array[i] = a % 10;
            a /= 10;
        }
        return true;
    }
}
