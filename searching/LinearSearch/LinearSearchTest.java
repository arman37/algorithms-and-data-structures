public class LinearSearchTest {
    public static void main(String[] args) {
        int arr[] = {5,3,7,1,4,2,9,8,6};
        if (LinearSearch.search(arr, 4) >= -1) {
            System.out.println("search value found");
        }
        if (LinearSearch.search(arr, 10) == -1) {
            System.out.println("value not found");
        }
    }
}
