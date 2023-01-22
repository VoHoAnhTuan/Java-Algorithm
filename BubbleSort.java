/*
 * Ho Anh Tuan Vo
 * Bubble Sort
 * 
 * In-place algorithm
 * O(n^2) quadratic time complexity
 * 
 * This algorithm degrades quickly
 * For example, it will take 100 steps to sort 10 elements
 * 
 * This example is descending from high to low numbers
 */


public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {50, 49, 4, 1 , 7};

    for (int theLastUnsortedIndex = array.length - 1; theLastUnsortedIndex > 0; theLastUnsortedIndex--) { 
        for (int i = 0; i < theLastUnsortedIndex; i++) {
            if (array[i] < array[i + 1]) { // change '<'' to ''>'' if ascending
                swap(array, i, i + 1);
            }
        }
      
    }

       for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
       }
    }


    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
