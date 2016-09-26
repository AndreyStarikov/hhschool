package org.andreystarikov;

/**
 * Created by Andrey on 23.09.2016.
 */
public class Equation {

    private char[] x, y, z;
    private int[] min;

    public Equation(String x, String y, String z) {
        this.x = x.toCharArray();
        this.y = y.toCharArray();
        this.z = z.toCharArray();
        min = new int[]{0, 0, 0, 0, 0};
        setMin(this.x);
        setMin(this.y);
        setMin(this.z);
    }

    public int getCount() {
        int count = 0;
        for (int a = min[0]; a < 10; a++) {
            for (int b = min[1]; b < 10; b++) {
                for (int c = min[2]; c < 10; c++) {
                    for (int d = min[3]; d < 10; d++) {
                        for (int e = min[4]; e < 10; e++) {
                            int[] abcde = {a, b, c, d, e};
                            if (isSolution(abcde)) {
                                ////////
                                for (int i = 0; i < abcde.length; i++) {
                                    System.out.print(abcde[i]);
                                }
                                System.out.println();
                                /////
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    private void setMin(char[] ch) {
        switch (ch[0]) {
            case 'a':
                min[0] = 1;
                break;
            case 'b':
                min[1] = 1;
                break;
            case 'c':
                min[2] = 1;
                break;
            case 'd':
                min[3] = 1;
                break;
            case 'e':
                min[4] = 1;
                break;
            default:
                break;
        }
    }

    private boolean isSolution(int[] abcde) {
        int a = getNumber(x, abcde);
        int b = getNumber(y, abcde);
        int c = getNumber(z, abcde);
        return a + b == c;
    }

    private int getNumber(char[] ch, int[] abcde) {
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            int number;
            switch (ch[i]) {
                case 'a':
                    number = abcde[0];
                    break;
                case 'b':
                    number = abcde[1];
                    break;
                case 'c':
                    number = abcde[2];
                    break;
                case 'd':
                    number = abcde[3];
                    break;
                case 'e':
                    number = abcde[4];
                    break;
                default:
                    number = 0;
                    break;
            }
            sum += number * Math.pow(10, ch.length - 1 - i);
        }
        return sum;
    }
}
