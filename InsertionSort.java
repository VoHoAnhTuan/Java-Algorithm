/*
 * Ho Anh Tuan Vo
 * Insertion Sort
 * 
 * O(n^2) quadratic time complexity
 * In-place algorithm
 * 
 * For example, it will take 100 steps to sort 10 elements
 * stable algorithm
 * 
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {50, 49, 4, 1 , 7};

        for ( int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int i;
            for ( i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1]; //shift sortedArray to the right until the right position
            }

            array[i] = newElement;
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
