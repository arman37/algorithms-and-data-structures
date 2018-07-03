public class SelectionSort {
    public static void sort(int arr[]) {
        int length = arr.length;
        int i;
        int j;
        int temp;
        int minIdx;

        for (i = 0; i < length -1; i++) {
            minIdx = i;
            // finds index of smallest number
            for (j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swaps elements
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
