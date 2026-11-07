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
**Runtime:** 90 ms (beats 8.59%)  
**Memory:** 46.6 MB (beats 12.10%)  
**Submitted:** 2026-11-07T13:30:40.576Z  

```java
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Arrays.sort(nums);
        // List<List<Integer>> ans = new ArrayList<>();
        // int n = nums.length;
        //  // int ans =0;
        // for (int a = 0; a < n - 3; a++) {
        //     for (int b = a + 1; b < n - 2; b++) {
        //         for (int c = b + 1; c < n-1; c++) {
        //             for (int d = c + 1; d < n; d++) {
        //              long sum = (long)nums[a]+nums[b]+nums[c]+nums[d];

        //                 if (sum == target) {
        //                     List<Integer> temp = Arrays.asList(
        //                         nums[a], nums[b], nums[c], nums[d]
        //                     );
        //              if(!ans.contains(temp)){
        //                 ans.add(temp);
        //              }
        //             }
        //         }
        //     }
        // }
        // }
        // return ans;

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    //ArrayList<Integer> temp = new ArrayList<>();

                    if (sum == target) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);

                        if (!ans.contains(temp)) {
                            ans.add(temp);
                        }
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
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