class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Arrays.sort(nums);
        // List<List<Integer>> ans = new ArrayList<>();
        // int n = nums.length;
        //  // int ans =0;
        // for (int a = 0; a < n - 3; a++) {
        //     for (int b = a + 1; b < n - 2; b++) {
        //         for (int c = b + 1; c < n-1; c++) {
        //             for (int d = c + 1; d < n; d++) {
        //              long sum = (long)nums[a]+nums[b]+nums[c]+nums[d];

        //                 if (sum == target) {
        //                     List<Integer> temp = Arrays.asList(
        //                         nums[a], nums[b], nums[c], nums[d]
        //                     );
        //              if(!ans.contains(temp)){
        //                 ans.add(temp);
        //              }
        //             }
        //         }
        //     }
        // }
        // }
        // return ans;

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    //ArrayList<Integer> temp = new ArrayList<>();

                    if (sum == target) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);

                        if (!ans.contains(temp)) {
                            ans.add(temp);
                        }
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;

    }
}