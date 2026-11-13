# Search Insert Position

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,3,5,6], target = 5
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,3,5,6], target = 2
Output: 1

```

 **Example 3:** 

```
Input: nums = [1,3,5,6], target = 7
Output: 4

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums contains distinct values sorted in ascending order.
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.2 MB (beats 79.90%)  
**Submitted:** 2026-11-13T12:45:15.608Z  

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int n = nums.length;
       // int index =0;
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target){
              return i;
            }
        }
        //return nums[i]

        return n;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-insert-position/)