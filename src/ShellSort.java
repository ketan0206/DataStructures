public class ShellSort {

    public static void main(String[] args) {

        int[] input = new int[] {3,1,5,8,-34,65,-77,44,0};
        int[] output = shellSort(input);
        printSortedArray(output);

    }

    private static int[] shellSort (int[] input) {

        int size = input.length;
        int gap = size;
        while (gap>=1) {
            gap = gap/2;
            int firstUnsortedIndex = gap;
            while (firstUnsortedIndex < size) {
                int value = input[firstUnsortedIndex];
                int i;
                //gap = gap > 1 ? gap/2 : 1;
                for (i = firstUnsortedIndex-gap ; i >= 0 ; i=i-gap) {
                    if (input[i] > value) {
                        input[i+gap] = input[i];
                    } else {
                        break;
                    }
                }
                input[i+gap] = value;
                firstUnsortedIndex++;
            }
        }
        return input;

    }

    private static void printSortedArray (int[] array) {

        for (int i : array) {
            System.out.println(i);
        }

    }

}
