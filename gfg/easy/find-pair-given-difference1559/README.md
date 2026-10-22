# Pair With Difference

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array,  **arr[]**  and an integer  **x**, return true if there exists a pair of elements in the array whose absolute difference is  **x**, otherwise, return false.

 **Examples:** 

```
Input: arr[] = [5, 20, 3, 2, 5, 80], x = 78
Output: true
Explanation: Pair (2, 80) have an absolute difference of 78.
```

```
Input: arr[] = [90, 70, 20, 80, 50], x = 45
Output: false
Explanation: There is no pair with absolute difference of 45.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T16:49:12.790Z  

```java
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
         Arrays.sort(arr);
      
        
        int i=0;
        int j = 1;
        while(j<arr.length){
            int diffn = arr[j]-arr[i];
            if(diffn == x){
                return true;
              
            }else if(diffn > x){
                i++;
            }else{
                j++;
            }
             if (i == j) {
                 j++;
             }
        }
       return false;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1)