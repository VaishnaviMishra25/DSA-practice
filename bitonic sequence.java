// Java program to find maximum element in bitonic
// array using linear search

import java.util.Arrays;

class GfG {
    static int bitonicPoint(int[] arr) {
        int res = arr[0];

        // Traverse the array to find 
        // the maximum element
        for (int i = 1; i < arr.length; i++) 
            res = Math.max(res, arr[i]);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {8, 10, 100, 400, 500, 3, 2, 1};
        System.out.println(bitonicPoint(arr));
    }
}
