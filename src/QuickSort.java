public class QuickSort {

    public static void main(String[] args) {

        int[] input = new int[] {6,2,-66,-3,7,2,5,0,100};
        int[] output = quickSort(input);
        printSortedArray(output);

    }

    private static int[] quickSort(int[] input) {

        divide(input, 0, input.length);
        return input;

    }

    private static void divide(int[] input, int start, int end) {

        if (end-start<2) {
            return;
        }
        int partitionIndex = partition(input, start, end);
        divide(input, start, partitionIndex);
        divide(input, partitionIndex+1, end);

    }

    private static int partition(int[] input, int start, int end) {

        int value = input[start];
        int i = start;
        int j = end;
        while(i<j) {
            while(i<j && input[--j]>value); // empty loop
            input[i] = input[j];
            while(i<j && input[++i]<value); // empty loop
            input[j] = input[i];
        }
        input[j] = value;
        return j;
    }

    private static void printSortedArray(int[] array) {

        for (int i : array) {
            System.out.println(i);
        }

    }

}
