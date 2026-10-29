# 3Sum Closest

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` of length `n` and an integer `target`.

Find three integers at  **distinct indices**  in `nums` such that the sum is  **closest**  to `target`.

Return the sum of the three integers.

You may assume that each input would have  **exactly**  one solution.

 

 **Example 1:** 

```
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

```

 **Example 2:** 

```
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

```

 

 **Constraints:** 

- 3 <= nums.length <= 500
- -1000 <= nums[i] <= 1000
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 562 ms (beats 5.00%)  
**Memory:** 44.3 MB (beats 99.70%)  
**Submitted:** 2026-10-29T18:19:19.760Z  

```java
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int ans = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] +nums[j] + nums[k];

                     if (Math.abs(sum - target) < Math.abs(ans - target)) {
                        ans = sum;
                    }
                    if ( sum == target) {
                        return sum;
                    }
                }
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/3sum-closest/)