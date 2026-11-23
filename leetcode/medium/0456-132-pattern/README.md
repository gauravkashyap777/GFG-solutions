# 132 Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of `n` integers `nums`, a  **132 pattern**  is a subsequence of three integers `nums[i]`, `nums[j]` and `nums[k]` such that `i < j < k` and `nums[i] < nums[k] < nums[j]`.

Return `true` *if there is a  **132 pattern**  in* `nums` *, otherwise, return* `false` *.* 

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,2,3,4]
Output: false
Explanation: There is no 132 pattern in the sequence.

```

 **Example 2:** 

```
Input: nums = [3,1,4,2]
Output: true
Explanation: There is a 132 pattern in the sequence: [1, 4, 2].

```

 **Example 3:** 

```
Input: nums = [-1,3,2,0]
Output: true
Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 2 * 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 38 ms (beats 64.04%)  
**Memory:** 98.4 MB (beats 36.31%)  
**Submitted:** 2026-11-23T16:23:56.825Z  

```java
class Solution {
    public boolean find132pattern(int[] nums) {

        // int n = nums.length;

        //      for(int i=0;i<n-2;i++){
        //         for(int j=i+1;j<n-1;j++){
        //             for(int k=j+1;k<n;k++){
                     
        //              if(nums[i] < nums[k] && nums[k] < nums[j]){
        //                 return true;
        //              }
        //             }
        //         }
        //      }
        // return false;

           
           Stack<Integer> st = new Stack<>();
           
           int second = Integer.MIN_VALUE;

           for(int i = nums.length-1;i>=0;i--){

                 if(nums[i] < second){
                    return true;
                 }

                 while(!st.isEmpty() && st.peek() < nums[i]){
                    second = st.pop();
                 }
                 st.push(nums[i]);
           }
                     return false;

        
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/132-pattern/)