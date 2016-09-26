package org.andreystarikov;

import java.util.ArrayList;

/**
 * Created by Andrey on 22.09.2016.
 */
public class Palindrome {
    public static int getCount(int max) {
        int count = 0;
        int x = 0;
        while (x <= max) {
            ArrayList original = IntUtil.getArrayListFromInt(x);
            boolean flag = true;
            for (int i = 0; i < 50; i++) {
                ArrayList revers = IntUtil.getReverseList(original);
                if (IntUtil.listCompare(original, revers) && i != 0) {
                    flag = false;
                    break;
                }
                original = IntUtil.addition(original, revers);
            }
            if (flag) {
//                System.out.println(x);
                count++;
            }
            x++;
        }
        return count;
    }
}
