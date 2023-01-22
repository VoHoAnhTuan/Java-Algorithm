/*
 * Ho Anh Tuan Vo
 * Selection Sort
 * 
 * O(n^2) quadratic time complexity
 * In-place algorithm
 * 
 * For example, it will take 100 steps to sort 10 elements
 * Unstable algorithm
 * 
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {50, 49, 4, 1 , 7};
        
        for (int theLastUnsortedIndex = array.length - 1; theLastUnsortedIndex > 0; theLastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= theLastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }

            swap(array, theLastUnsortedIndex, largest);
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