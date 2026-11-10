# Majority Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array of size `n`, find all elements that appear more than `⌊n / 3⌋` times.

 

Original
Java
 **Example 1:** 

```
Input: nums = [3,2,3]
Output: [3]

```

 **Example 2:** 

```
Input: nums = [1]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1,2]
Output: [1,2]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -109 <= nums[i] <= 109

 

 **Follow up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 49.94%)  
**Memory:** 57.6 MB (beats 5.02%)  
**Submitted:** 2026-11-10T18:05:45.804Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element-ii/)