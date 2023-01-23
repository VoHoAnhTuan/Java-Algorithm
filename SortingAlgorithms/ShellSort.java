package SortingAlgorithms;
/*
 * Ho Anh Tuan Vo
 * Shell Sort
 * 
 * It is basically Insertion sort with a gap
 * O(n^2) quadratic time complexity, but it can perform much better than Insertion sort
 * In-place algorithm
 * 
 * Unstable algorithm
 * Ascending order
 */

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {21, 35, -16, 7, 55, 1, -23};

        for (int gap = array.length / 2; gap > 0; gap /= 2) { // gap > 0 or it will eventually compare to itself
            
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > newElement) { // j >= gap is to signal that it hits the front of the array
                    array[j] = array[j- gap];
                    j -= gap; // move the range down
                }

                array[j] = newElement; // After shifting elements right by while loop, we insert the new element to its position
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
}
}
