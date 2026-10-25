class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.length-1;

        for(int i=0;i<n;i++){
            if(nums[i] == nums[i+1]){
                ans.add(i+1);
            }
        }
        return ans;
    }
}