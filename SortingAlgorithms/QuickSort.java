package SortingAlgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {21, 35, -16, 7, 55, 1, -23};

        quickSort(array, 0, array.length);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;

        //i and j do not cross
        while (i < j) {
            
            //Empty loop body
            while (i < j && array[--j] >= pivot); // if array[j] smaller than pivot, stop the loop
            if (i < j) { // After breaking out of the loop when i < j, i == j so we don't want to write a value to itself - Optimization purpose
                array[i] = array[j]; // move the small number to the left
            }

            while (i < j && array[++i] <= pivot); // if array[i] larger than pivot, stop the loop
            if (i < j) { // After breaking out of the loop when i < j, i == j so we don't want to write a value to itself - Optimization purpose
                array[j] = array[i]; // move the large number to the right
            }
        }

        // i == j, so j or i is the index of pivot
        array[j] = pivot;
        return j;
    }
}
