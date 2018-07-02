public class JumpSearchTest {
    public static void main(String[] args) {
        int arr[] = {1, 8, 10, 15, 20, 25, 45, 65};
        int index = JumpSearch.search(arr, 1);

        if (index > -1) {
            System.out.println("search value found at index " + index);
        } else {
            System.out.println("search value not found");
        }
    }
}
