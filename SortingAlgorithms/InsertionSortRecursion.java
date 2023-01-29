package SortingAlgorithms;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        int[] array = {50, 49, 4, 1 , 7};

        insertionSortRecursion(array, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void insertionSortRecursion(int[] array, int numItems) {
        if (numItems < 2) {
            return;
        }

        insertionSortRecursion(array,  numItems - 1);
        
        int newElement = array[numItems - 1];
        int i;
        for (i = numItems - 1; i > 0 && array[i - 1] > newElement; i--) {
            array[i] = array[i - 1];
        }

        array[i] = newElement;
    }
}
