public class QuickSort {
    public static void sort(int arr[], int start, int end) {
        int pivot = partition(arr, start, end);
        if (start < pivot - 1) {
            sort(arr, start, pivot - 1);
        }
        if (pivot < end) {
            sort(arr, pivot, end);
        }
    }

    private static int partition(int arr[], int start, int end) {
        int temp;
        int i = start;
        int j = end;
        int pivot = arr[(start + end) / 2]; // selects middle element as pivot

        while (i <= j) {
            // skip elements that are smaller than pivot element
            while (arr[i] < pivot) {
                i++;
            }
            // skip elements that are greater than pivot element
            while (arr[j] > pivot) {
                j--;
            }
            // swaps element of the left side of pivot with element of the right side of the pivot
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // returns position of the pivot element
        return i;
    }
}
