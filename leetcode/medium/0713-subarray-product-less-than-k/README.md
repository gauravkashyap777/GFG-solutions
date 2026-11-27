# Subarray Product Less Than K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of integers `nums` and an integer `k`.

Return the number of contiguous subarrays where the  **product**  of all the elements in the  **subarray**  is  **strictly less**  than `k`.

 

Original
Java
 **Example 1:** 

```
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 0
Output: 0

```

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- 1 <= nums[i] <= 1000
- 0 <= k <= 106

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.4 MB  
**Submitted:** 2026-11-27T16:37:04.601Z  

```java
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        

        int n = nums.length;
        int count1 =0;
         int count2 =0;
         int count3 =0;
         int count4=0;
        int ans1 = 0;

          for(int i=0;i<n;i++){


            if(nums[i] * 1 < k){
                 count1++;
            }
          }
            for(int i=0;i<n-1;i++){
    
            if(nums[i] * nums[i+1] <k){
                count2++;
        
            }
             }
             for(int i=0;i<n-2;i++){
 
             if(nums[i] * nums[i+1]* nums[i+2] <k){
                count3++;
        
            }
                }

                  for(int i=0;i<n-3;i++){
 
             if(nums[i] * nums[i+1]* nums[i+2] * nums[i+3] <k){
                count4++;
        
            }
                }
              ans1 = count1+count2+count3+count4;
            
           return ans1;
   }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-product-less-than-k/)