# Maximum Gap

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, return  *the maximum difference between two successive elements in its sorted form*. If the array contains less than two elements, return `0`.

You must write an algorithm that runs in linear time and uses linear extra space.

 

Original
Java
 **Example 1:** 

```
Input: nums = [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.

```

 **Example 2:** 

```
Input: nums = [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 0 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 44 ms (beats 64.24%)  
**Memory:** 90.3 MB (beats 65.79%)  
**Submitted:** 2026-11-10T13:28:05.183Z  

```java
class Solution {
    public int maximumGap(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int max =0;
         if (n < 2) {
                return 0;
            }
        for (int i = 0; i < n - 1; i++) {
            int diff = nums[i+1] - nums[i];
                    
        
            if(diff > max){
                max = diff;
            }
        }
           
        

        return max;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-gap/)