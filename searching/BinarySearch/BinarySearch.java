public class BinarySearch {
    public static int search(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                right = mid - 1;
            }
            if (key > arr[mid]) {
                left = mid + 1;
            }
        }
        // return -1 if no match is found
        return -1;
    }
}
