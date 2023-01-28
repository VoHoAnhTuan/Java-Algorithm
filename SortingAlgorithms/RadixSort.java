package SortingAlgorithms;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = {823, 333, 235, 710};

        radixSort(array, 10, 3);

    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
    }

    public static void radixSort(int[] array, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(array, i, radix);
        }
    }

    public static void radixSingleSort(int[] array, int position, int radix) {
        int numItems = array.length;
        int[] countingArray = new int[radix];

        // Count raw occurrences
        for (int value: array) {
            countingArray[getDigit(position, value, radix)]++;
        }

        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countingArray[j] += countingArray[j - 1];
        }

        // Use temp array to sort
        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countingArray[getDigit(position, array[tempIndex], radix)]] = array[tempIndex];
        }

        // Write back to original array
        System.arraycopy(temp, 0, array, 0, numItems);
    }

    // Extract each position from right to left based on position
    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % 10;
    }
    
}
