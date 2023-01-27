package SortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;

/*
 * Ho Anh Tuan Vo
 * Counting Sort
 * 
 * Not in-place algorithm
 * O(n + k) or O(n) - linear time complexity
 * 
 * Makes assumption about data and doesn't use comparison
 * Counts the occurrences of each value
 * 
 * It only works with non-negative discrete numbers (not floats, or strings,...)
 * Values must be in a specific range
 * 
 * Only use counting sort when you have reasonable values and range
 */

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 5, 9, 8, 2, 8, 8, 7, 10, 4, 3};

        countingSort(array, 1, 10);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void countingSort(int[] array, int min, int max) {
        int[] countArray = new int[(max - min) + 1]; // Create counting array

        // Count occurrences
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }

        // Copy to input array
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) { 
                array[j++] = i;
                countArray[i - min]--; // Decrement occurence
            }
        }
    }

}
