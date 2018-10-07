import java.util.Arrays;

class RadixSort {
    public void radixSort(int[] nums) {

        int max = findMax(nums);

        for (int i = 1; max / i > 0; i *= 10) {
            subCountingSort(nums, i);
        }

    }

    private void subCountingSort(int[] nums, int digit) {
        int[] output = new int[nums.length];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < nums.length; i++) {
            int temp = (nums[i] / digit) % 10;
            count[temp]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        // 从后往前,
        // [170, 90, 80, 802, 2, 24, 45, 75, 66]
        // [802, 2, 24, 45, 66, 170, 75, 80, 90]
        // [2, 24, 45, 66, 75, 80, 90, 170, 802]
        // 从前往后
        // [80, 90, 170, 2, 802, 24, 75, 45, 66]
        // [802, 2, 24, 45, 66, 75, 170, 80, 90]
        // [2, 24, 45, 66, 75, 80, 90, 170, 802]
        // 区别在于第三轮 第三位为0的七个数字，
        // count之后0 出现的次数为7，如果顺序遍历的话2的位置应该6，
        // 显然是错误的 倒叙遍历的话2的顺序为小的 在最前面才是正确的
        // 原因在于多个数字有相同的digit，而从digit开始求出output的话
        // 顺序遍历 第一个数字肯定是在最末尾的。 最后一个数字在最开头
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = (nums[i] / digit) % 10;
            output[count[temp] - 1] = nums[i];
            count[temp]--;
        }
        for (int i = 0; i < output.length; i++) {
            nums[i] = output[i];
        }
    }

    private int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }
}