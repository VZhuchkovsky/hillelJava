import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Влад on 14.04.2015.
 */
public class ArraySort {
    static double number;


    public static void main(String[] params) {
        int[] arr = {1, 3, 5, 2, 6, 4};
        System.out.println("Array: ");
        for (int i = 0; i <= 5; i++) {
            System.out.print(arr[i] + ";");
        }
        System.out.println("   ");

        int[] brr = Sort(arr);
        System.out.println("Sorted Array: ");
        for (int i = 0; i <= 5; i++) {
            System.out.print(brr[i] + ";");
        }


       /* Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of arrays: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter your arrays: ");

        for (int i = 0; i < n; i++) {
            arr = sc.nextInt();
        }
        String s = Arrays.toString(arr);
        System.out.println(s);

        System.out.println();
       */
    }

    static int[] Sort(int[] arr) {

        if (arr.length > 1) {
            int[] left = new int[arr.length / 2];
            int[] right = new int[arr.length - left.length];

            for (int i = 0; i < left.length; i++) {
                left[i] = arr[i];
            }
            for (int i = 0; i < right.length; i++) {
                right[i] = arr[left.length + i];
            }
            if (left.length > 1)
                left = Sort(left);
            if (right.length > 1)
                right = Sort(right);
            arr = MergeSort(left, right);
        }
        return arr;
    }

    static int[] MergeSort(int[] left, int[] right) {
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

                if (l < left.length)
                    number += left.length - 1;
            }

        }
        return arr;
    }

}
