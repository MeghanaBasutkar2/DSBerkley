public class BinarySearch {
    static int left;
    static int right;
    static int element;
    static int[] array = new int[]{2, 4, 6, 8, 12, 14, 18, 22, 24, 26, 28, 30};
    public static final int FAILURE = -1;

    public static void main(String[] args) {
        System.out.println(findElementByBinarySearch(array, 0, 11, 12));
    }

    protected void test1(){
        // will work even though its protected even if the other classes don extend this but are in same package as this class
    }
    private static int findElementByBinarySearch(int[] array, int left, int right, int element) {
        int mid = (left + right) / 2;
        if (left > right) {
            return FAILURE;
        }
        if (array[mid] == element) {
            return mid;
        } else if (array[mid] > element) {
            return findElementByBinarySearch(array, left, mid - 1, element);
        } else if (array[mid] < element) {
            return findElementByBinarySearch(array, mid + 1, right, element);
        }
        return FAILURE;
    }
}
