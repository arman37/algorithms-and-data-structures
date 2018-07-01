public class LinearSearch {
    // returns index of the value if found, otherwise returns -1
    public static int search(int arr[], int val) {
        int length = arr.length;
        for (int i = 0; i < length ; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        // return -1 if no match is found
        return -1;
    }
}
