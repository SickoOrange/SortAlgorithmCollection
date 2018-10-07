import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // test counting sort
        int[] arr = { 802, 2, 24, 45, 66, 75, 170, 80, 90 };
        CountingSort countingSort = new CountingSort();
        countingSort.countingSort(arr);
        System.out.println(Arrays.toString(arr));

        // test radis sort
        int[] testcase2 = { 170, 45, 75, 90, 802, 24, 2, 66, 80 };
        RadixSort radixSort = new RadixSort();
        radixSort.radixSort(testcase2);
        System.out.println(Arrays.toString(testcase2));

        // test bucket sort
        int[] testcase3 = { 170, 45, 75, 90, 802, 24, 2, 66, 80 };
        BucketSort bucketSort = new BucketSort();
        bucketSort.bucketSort(testcase3);
        System.out.println(Arrays.toString(testcase3));

        // test insection sort
        // test shell sort
        // test merge sort
        // test quick sort
        // test bubble sort
        // test tim sort
    }
}