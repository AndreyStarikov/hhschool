package org.andreystarikov;

/**
 * Created by Andrey on 22.09.2016.
 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey] > currElem){
                arr[prevKey+1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey+1] = currElem;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 9, 3, 5, 7};
        insertionSort(a);
        for (int b:a) System.out.println(b);
    }
}
