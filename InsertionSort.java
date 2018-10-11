import java.util.Arrays;

class InsertionSort {
    public void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                // move element forward
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

    public void recursiveInsertionSort(int[] nums, int n) {
        if (n <= 1)
            return;
        recursiveInsertionSort(nums, n - 1);
        int last = nums[n - 1];
        int j = n - 2;
        while (j >= 0 && nums[j] > last) {
            // move element forward
            nums[j + 1] = nums[j];
            j--;
        }
        nums[j + 1] = last;
    }

    public static void main(String[] args){
        InsertionSort insertionSort = new InsertionSort();
        int[] nums={9,8,7,6,5,4,3,2,1};
      //  insertionSort.insertionSort(nums);
        insertionSort.recursiveInsertionSort(nums,nums.length);
        System.out.println(Arrays.toString(nums));


    }
}