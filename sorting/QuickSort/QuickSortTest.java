public class QuickSortTest {
    public static void main(String[] args) {
        int arr[] = {10, 1, 14, 25, 20, 15, 64, 78, 34, 12, 35, 62};
        System.out.print("Before sorting: ");
        printArray(arr);
        QuickSort.sort(arr, 0, arr.length - 1);
        System.out.print("After sorting: ");
        printArray(arr);
    }

    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
