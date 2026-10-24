# Intersection of Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must be  **unique**  and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 6.93%)  
**Memory:** 45.1 MB (beats 37.94%)  
**Submitted:** 2026-10-24T16:48:43.719Z  

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

          HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){

                if(nums1[i] == nums2[j]){
                     st.add(nums1[i]);
                }
            }
        }
       // return st;
               return st.stream().mapToInt(Integer::intValue).toArray();

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)