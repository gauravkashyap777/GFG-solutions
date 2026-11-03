
import java.util.Arrays;
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        int n = nums.length;
        int count = 0;
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (count < k && nums[i] < 0) {
                nums[i] = -nums[i];
                count++;
            }
        }

        int min = 0;

        for (int i = 1; i < n; i++) {
            if (Math.abs(nums[i]) < Math.abs(nums[min])) {
                min = i;
            }
        }
        if ((k - count) % 2 != 0) {
            nums[min] = -nums[min];
        }

        for (int i = 0; i < n; i++) {
            sum += nums[i];

        }

        return sum;
    }
}

// we will chose an index i and replace with nums[i]  with -nums[i]
// we execute this process till k times 
// and their sum 