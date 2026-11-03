# Maximize Sum Of Array After K Negations

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` and an integer `k`, modify the array in the following way:

- choose an index i and replace nums[i] with -nums[i].

You should apply this process exactly `k` times. You may choose the same index `i` multiple times.

Return  *the largest possible sum of the array after modifying it in this way*.

 

 **Example 1:** 

```
Input: nums = [4,2,3], k = 1
Output: 5
Explanation: Choose index 1 and nums becomes [4,-2,3].

```

 **Example 2:** 

```
Input: nums = [3,-1,0,2], k = 3
Output: 6
Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2].

```

 **Example 3:** 

```
Input: nums = [2,-3,-1,5,-4], k = 2
Output: 13
Explanation: Choose indices (1, 4) and nums becomes [2,3,-1,5,4].

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -100 <= nums[i] <= 100
- 1 <= k <= 104

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 13.12%)  
**Memory:** 44.3 MB (beats 62.29%)  
**Submitted:** 2026-11-03T18:41:38.777Z  

```java

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
```

---

[View on LeetCode](https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/)