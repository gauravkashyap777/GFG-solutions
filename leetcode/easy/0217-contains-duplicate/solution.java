class Solution {
    public boolean containsDuplicate(int[] nums) {



    //    int n = nums.length;
    //    int count=0;
    //     int min =0;
    //    for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         if(nums[i] == nums[j]){
    //             count++;

    //             if(count>min){
    //                 return true;
    //             }
    //         }
    //     }
    //    }
     
    //     return false;


              Arrays.sort(nums);

              for(int i=0;i<nums.length-1;i++){
                if(nums[i] == nums[i+1]){
                    return true;
                }
              }
           
           return false;
    }
}