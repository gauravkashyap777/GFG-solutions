class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums);

        int count = 1;

        for(int i = 1; i < n; i++) {

            if(nums[i] == nums[i - 1]) {
                count++;
            } else {

                if(count > n / 3) {
                    list.add(nums[i - 1]);
                }

                count = 1;
            }
        }

        // Check last element
        if(count > n / 3) {
            list.add(nums[n - 1]);
        }

        return list;
    }
}