public class MergeSort {

    public static void main(String[] args) {

        int[] input = new int[] {3,1,5,-56,-3,-6,44,99,0};
        int[] output = mergeSort(input);
        printSortedArray(output);

    }

    private static int[] mergeSort(int[] input) {

        int start = 0;
        int end = input.length;
        divide(input, start, end);
        return input;

    }

    private static void divide(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }
        divide(input, start, (start+end)/2);
        divide(input, (start+end)/2, end);
        merge(input, start, end);

    }

    private static void merge(int[] array, int start, int end) {

        int i = start;
        int j = (start+end)/2;
        int k = 0;
        int[] tempArray = new int[end-start];
        while(i<(start+end)/2 && j<end) {
            if (array[i]<=array[j]) {
                tempArray[k++]=array[i++];
            } else {
                tempArray[k++]=array[j++];
            }
        }
        while (i<(start+end)/2) {
            tempArray[k++]=array[i++];
        }
        while (j<end) {
            tempArray[k++]=array[j++];
        }
        if (tempArray.length >= 0)
            System.arraycopy(tempArray, 0, array, start, tempArray.length);

    }

    private static void printSortedArray(int[] array) {

        for (int i : array) {
                System.out.println(i);
        }

    }

}
