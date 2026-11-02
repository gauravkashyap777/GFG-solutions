# Sort Array By Parity II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers `nums`, half of the integers in `nums` are  **odd**, and the other half are  **even**.

Sort the array so that whenever `nums[i]` is odd, `i` is  **odd**, and whenever `nums[i]` is even, `i` is  **even**.

Return  *any answer array that satisfies this condition*.

 

 **Example 1:** 

```
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

```

 **Example 2:** 

```
Input: nums = [2,3]
Output: [2,3]

```

 

 **Constraints:** 

- 2 <= nums.length <= 2 * 104
- nums.length is even.
- Half of the integers in nums are even.
- 0 <= nums[i] <= 1000

 

 **Follow Up:**  Could you solve it in-place?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.71%)  
**Memory:** 48.7 MB (beats 31.22%)  
**Submitted:** 2026-11-02T08:02:09.995Z  

```java
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int n = nums.length;
        int[] element = new int[n];
        int even =0;
        int odd = 1;
        for(int i=0;i<n;i++){
            if(nums[i]%2 ==0){
             element[even] = nums[i];
             even+=2;
            }
    
            else{
                element[odd] = nums[i];
                odd+=2;
            }
        }
        return element;
    }
}


// atfirst i will traverse the array at first we find simiontaneously.
// one put even and another odd repeat again and again this process.
```

---

[View on LeetCode](https://leetcode.com/problems/sort-array-by-parity-ii/)