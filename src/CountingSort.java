public class CountingSort {

    public static void main(String[] args) {

        int[] input = new int[] {1,2,4,2,5,2,9,10,3};
        int[] output = countingSort(input);
        printSortedArray(output);

    }

    private static int[] countingSort(int[] array) {
        int[] temp = new int[11];
        for (int i : array) {
            temp[i]++;
        }
        int k = 0;
        for (int i=0; i<temp.length; i++) {
            for (int j = 0 ; j < temp[i]; j++) {
                array[k++] = i;
            }
        }
        return array;
    }

    private static void printSortedArray(int[] array) {

        for (int i : array) {
            System.out.println(i);
        }

    }

}
