import java.util.Arrays;

public class QuickSort {
    public void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int i = partition(nums, low, high);
            quickSort(nums, low, i - 1);
            quickSort(nums, i + 1, high);
        }
    }

    private int partition(int[] nums, int low, int high) {

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums[j] <= nums[high]) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return i + 1;

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {9, 8, 7,7,7, 6, 5, 4, 3, 2, 1};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
