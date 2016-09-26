package org.andreystarikov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 20.09.2016.
 */
public class IntUtil {
    final static int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE};

    // Requires positive x
    public static int stringSize(int x) {
        for (int i = 0; ; i++)
            if (x <= sizeTable[i])
                return i + 1;
    }

    public static int[] getArrayFromInt(int number) {
        int length = stringSize(number);
        int[] array = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }

    public static ArrayList getArrayListFromInt(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        int length = stringSize(number);
        for (int i = length - 1; i >= 0; i--) {
            list.add(0, number % 10);
            number /= 10;
        }
        return list;
    }

    public static ArrayList getReverseList(ArrayList original) {
        ArrayList reverse = new ArrayList();
        int size = original.size();
        for (int i = size - 1; i >= 0; i--) {
            reverse.add(original.get(i));
        }
        return reverse;
    }

    public static <T> boolean listCompare(List<T> a, List<T> a2) {
        if (a == a2)
            return true;
        if (a == null || a2 == null)
            return false;

        int length = a.size();
        if (a2.size() != length)
            return false;

        for (int i = 0; i < length; i++)
            if (a.get(i) != a2.get(i))
                return false;

        return true;
    }

    public static ArrayList<Integer> addition(ArrayList<Integer> a, ArrayList<Integer> a2) {
        if (a.size() != a2.size()) return null;
        int c;
        int overflow = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            c = a.get(i) + a2.get(i) + overflow;
            if (c < 10) {
                a.set(i, c);
                overflow = 0;
            } else {
                overflow = 1;
                a.set(i, c % 10);
            }
        }
        if (overflow == 1) a.add(0, overflow);
        return a;
    }
}
