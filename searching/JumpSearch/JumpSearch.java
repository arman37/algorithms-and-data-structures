public class JumpSearch {
    public static int search(int arr[], int key) {
        int left = 0;
        int right = 0;
        int n = arr.length;
        int jump = (int) Math.sqrt(arr.length);

        //finding the block where the searched element is present (if it is present)
        while (left < n && arr[left] <= key) {
            right = Math.min(n - 1, left + jump);

            if (arr[left] <= key && arr[right] >= key) {
                break;
            }

            left += jump;
        }

        if (left >= n || arr[left] > key) {
            return -1;
        }

        right = Math.min(n - 1, right);
        //linear search
        for (int i = left; i <= right && arr[i] <= key; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        // returns -1 if no match is found
        return -1;
    }
}
