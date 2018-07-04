public class InsertionSort {
    public static void sort(int arr[]) {
        int i;
        int j;
        int key;
        int length = arr.length;

        for (i = 1; i < length; i++) {
            key = arr[i];
            j = i;

            while (j >= 1 && arr[j - 1] > key) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }

            arr[j] = key;
        }
    }
}
