public class InsertionSort {

    public static void main (String[] args) {

        int[] input = new int[] {5,3,7,-1,-67,0,45,99,55};
        int[] output = insertionSort(input);
        printSortedArray(output);

    }

    private static int[] insertionSort (int[] input) {

        int firstUnsortedIndex = 1;
        while (firstUnsortedIndex<input.length) {
            int insert = input[firstUnsortedIndex];
            int i = firstUnsortedIndex ;
            for (; i > 0 ; i--) {
                if (input[i-1]<insert) {
                    break;
                } else {
                    input[i] = input[i-1];
                }
            }
            input[i] = insert;
            firstUnsortedIndex++;
        }
        return input;

    }

    private static void printSortedArray (int[] array) {

        for (int i : array) {
            System.out.println(i);
        }

    }

}
