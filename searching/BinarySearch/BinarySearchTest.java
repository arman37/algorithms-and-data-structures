public class BinarySearchTest {
    public static void main(String[] args) {
        int arr[] = {1, 8, 10, 15, 20, 25, 45, 65};
        int index = BinarySearch.search(arr, 25);

        if (index > -1) {
            System.out.println("search value found at index " + index);
        } else {
            System.out.println("search value not found");
        }
    }
}
