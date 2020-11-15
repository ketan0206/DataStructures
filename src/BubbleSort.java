public class BubbleSort {

    public static void main (String[] args) {

        int[] input = new int[] {5,1,7,4,7,8,8,-44,-67,45,48,60};
        int[] output = bubbleSort(input);
        printSortedArray(output);

    }

    private static int[] bubbleSort(int[] input) {

        int lastUnsortedIndex = input.length-1;
        while(lastUnsortedIndex>0) {
            for (int i = 0 ; i < lastUnsortedIndex ; i++) {
                if (input[i]>input[i+1]) {
                    swap(input, i);
                }
            }
            lastUnsortedIndex--;
        }

        return input;
    }

    private static void swap(int[] input, int i) {

        input[i] = input[i] + input[i+1];
        input[i+1] = input[i] - input[i+1];
        input[i] = input[i] - input[i+1];

    }

    private static void printSortedArray(int[] sortedArray) {

        for (int number : sortedArray) {
            System.out.println(number);
        }

    }

}
