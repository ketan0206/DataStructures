public class SelectionSort {

    public static void main (String[] args) {

        int[] input = new int[] {4,2,7,3,-2,-9,0,100,-22};
        int[] output = selectionSort(input);
        printSortedArray(output);

    }

    private static int[] selectionSort (int[] input) {

        int lastUnsortedIndex = input.length - 1;
        while (lastUnsortedIndex>0) {
            int indexOfLargest = 0;
            for (int i = 1 ; i < lastUnsortedIndex ; i++) {
                if (input[indexOfLargest]<=input[i]) {
                    indexOfLargest = i;
                }
            }
            swap(input, indexOfLargest, lastUnsortedIndex);
            lastUnsortedIndex--;
        }
        return input;

    }

    private static void swap (int[] input, int i, int j) {

        if (i==j) return;
        input[i] = input[i] + input[j];
        input[j] = input[i] - input[j];
        input[i] = input[i] - input[j];

    }

    private static void printSortedArray (int[] array) {

        for (int i : array) {
            System.out.println(i);
        }

    }

}
