class BucketSort {
    public void bucketSort(int[] nums) {
        int max = findMax(nums);
        int[] buckets = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            buckets[nums[i]]++;
        }
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            while (buckets[i]-- > 0) {
                nums[index++] = i;
            }
        }
    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}