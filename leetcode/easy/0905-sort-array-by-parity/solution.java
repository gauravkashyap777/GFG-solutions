class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int n = nums.length;
        int[] element = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                element[k++] = nums[i];
                // remaining part
            }
        }
        for (int i = 0; i < n; i++) {

            if (nums[i] % 2 != 0) {
                element[k++] = nums[i];
            }
        }
        return element;
    }
}