# Longest Harmonious Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We define a harmonious array as an array where the difference between its maximum value and its minimum value is  **exactly**  `1`.

Given an integer array `nums`, return the length of its longest harmonious subsequence among all its possible subsequences.

 

 **Example 1:** 

 **Input:**  nums = [1,3,2,2,5,2,3,7]

 **Output:**  5

 **Explanation:** 

The longest harmonious subsequence is `[3,2,2,2,3]`.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  2

 **Explanation:** 

The longest harmonious subsequences are `[1,2]`, `[2,3]`, and `[3,4]`, all of which have a length of 2.

 **Example 3:** 

 **Input:**  nums = [1,1,1,1]

 **Output:**  0

 **Explanation:** 

No harmonic subsequence exists.

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 2729 ms (beats 5.04%)  
**Memory:** 46.8 MB (beats 99.83%)  
**Submitted:** 2026-11-08T16:41:54.883Z  

```java
class Solution {
    public int findLHS(int[] nums) {
        
      int n = nums.length;
      int maxlength =0;

      for(int i=0;i<n;i++){
        int count1=0;
        int count2=0;

        for(int j=0;j<n;j++){
            if(nums[j] == nums[i]){
                count1++;
            }

            if(nums[j] == nums[i] +1){
                count2++;
            }
        }
            if(count1 > 0 && count2 > 0){
                int total = count1+count2;
                maxlength = Math.max(maxlength,total);
            }
        }
        return maxlength;
      
    }
}


// in the harmoniuious minm and maxm no of diffn is only 1
// return the llength of longest harmonius 
```

---

[View on LeetCode](https://leetcode.com/problems/longest-harmonious-subsequence/)