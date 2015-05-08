package com.hillel.com.hillel.oopBasics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by ???? on 14.04.2015.
 */
public class ArraySort {

    public static void main(String[] params) {
        //int[] arr = {1, 3, 5, 2, 6, 4};

        int[] a = generateRandomArray(10);

        System.out.println("Array: ");
        Arrays.toString(a);
        System.out.print(Arrays.toString(a));
        System.out.println("   ");

        a = sort(a);
        System.out.println("Sorted Array: ");
        Arrays.toString(a);
        System.out.print(Arrays.toString(a));

    }

    static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50);
        }
        return arr;
    }

    static int[] sort(int[] arr) {

        if (arr.length > 1) {

            int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
            int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
            if (left.length > 1) {
                left = sort(left);
            }
            if (right.length > 1) {
                right = sort(right);
            }
            arr = mergeSort(left, right);
        }
        return arr;
    }

    static int[] mergeSort(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int l = 0;
        int r = 0;


        for (int i = 0; i < arr.length; i++) {
            if (r >= right.length) {
                arr[i] = left[l];
                l++;
            } else if (l < left.length && left[l] < right[r]) {
                arr[i] = left[l];
                l++;
            } else {
                arr[i] = right[r];
                r++;
            }
        }
        return arr;
    }

}