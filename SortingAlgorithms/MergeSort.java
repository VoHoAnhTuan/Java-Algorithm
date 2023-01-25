package SortingAlgorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {50, 49, 4, 1 , 7};
        mergeSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        // if there is only a element then we stop, breaking condition
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid); // left sub-array
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        //Optimization - do not need to compare if the order is already in place
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        //Create a temp array to temporarily store sorted array before copying to original input array
        int[] tempArray = new int[end - start];
        
        //Loop through two left and right sub-arrays
        while (i < mid && j < end) {
            tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // {2, 4} {3, 6} - Not needed to handle when there are left-over elements in the right sub-array
        // Only handle when there are left-over elements in the lef sub-array {2, 6} {3, 4}, 
        // because it is already in order in the original input array.


        // i is the index of the first left-over element in the left sub-array, here we write left-over elements to input array before sorted temp array
        System.arraycopy(input, i, input, start + tempIndex, mid - i); // mid - 1 will become 0 if there is no left-over element in the left sub-array
        System.arraycopy(tempArray, 0, input, start, tempIndex); // Just copy elements actually in tempArray to input array


    }
}
