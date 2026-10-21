# Permute Arrays for Sum Threshold

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two arrays  **a[]**,  **b[]**, and an integer  **k**, find if it is possible to permute both arrays such that for every index i, arr1[i] + arr2[i] ≥ k. 

 **Examples:** 

```
Input: k = 10, a[] = [2, 1, 3], b[] = [7, 8, 9]. 
Output: true
Explanation: Permutation  arr1[] = [1, 2, 3] and arr2[] = [9, 8, 7] satisfy the condition arr1[i] + arr2[i] >= k
```

```
Input: k = 5, a[] = [1, 2, 2, 1], b[] = [3, 3, 3, 4].
Output: false
Explanation: Since any permutation won't give the answer.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T17:06:20.398Z  

```java
class Solution {
    public boolean isPossible(int k, int[] a, int[] b) {
        // code here
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0;i<a.length;i++){
            if(a[i]+b[b.length-1-i]<k){
                return false;
            }
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/permutations-in-array1747/1)