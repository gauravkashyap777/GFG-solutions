# 4Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array `nums` of `n` integers, return  *an array of all the  **unique**  quadruplets*  `[nums[a], nums[b], nums[c], nums[d]]` such that:

- 0 <= a, b, c, d < n
- a, b, c, and d are distinct.
- nums[a] + nums[b] + nums[c] + nums[d] == target

You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

```

 **Example 2:** 

```
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 200
- -109 <= nums[i] <= 109
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42 MB  
**Submitted:** 2026-10-29T19:04:31.076Z  

```java
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
         // int ans =0;
        for (int a = 0; a < n - 3; a++) {
            for (int b = a + 1; b < n - 2; b++) {
                for (int c = b + 1; c < n-1; c++) {
                    for (int d = c + 1; d < n; d++) {
                     long sum = (long)nums[a]+nums[b]+nums[c]+nums[d];

                     
                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(
                                nums[a], nums[b], nums[c], nums[d]
                            );
                     if(!ans.contains(temp)){
                        ans.add(temp);
                     }
                    }
                }
            }
        }
        }
        return ans;

    }
} 
```

---

[View on LeetCode](https://leetcode.com/problems/4sum/)