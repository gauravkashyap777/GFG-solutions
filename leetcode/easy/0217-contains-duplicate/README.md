# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return `true` if any value appears  **at least twice**  in the array, and return `false` if every element is distinct.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3,1]

 **Output:**  true

 **Explanation:** 

The element 1 occurs at the indices 0 and 3.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  false

 **Explanation:** 

All elements are distinct.

 **Example 3:** 

 **Input:**  nums = [1,1,1,3,3,4,3,2,4,2]

 **Output:**  true

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 25 ms (beats 18.62%)  
**Memory:** 81.1 MB (beats 97.26%)  
**Submitted:** 2026-10-30T16:54:42.240Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate/)