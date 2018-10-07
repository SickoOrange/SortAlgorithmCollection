import java.util.Arrays;

class CountingSort {
    public void countingSort(int[] arr) {
        System.out.println("counting sort");
        int max = findMax(arr);
        int[] count = new int[max + 1];
        Arrays.fill(count, 0);

        // store count of each elements
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // calculate the actual position for each index
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // build output array
        int[] output = new int[arr.length];
        for (int i = output.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // copy result to origin arr
        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
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