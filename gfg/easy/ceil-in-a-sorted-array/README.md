# Ceil in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array  **arr[]**  (which may contain duplicate elements) and an integer  **x**, find the 0-based index of the first element greater than or equal to x. This element is called the  **ceil**  of x.

If no such element exists, return -1.

 **Note:**  If multiple occurrences of the ceil exist, return the index of its first occurrence.

 **Examples:** 

```
Input: arr[] = [1, 2, 8, 10, 11, 12, 19], x = 5
Output: 2
Explanation: Smallest number greater than 5 is 8, whose index is 2.
```

```
Input: arr[] = [1, 2, 8, 10, 11, 12, 19], x = 20
Output: -1
Explanation: No element greater than 20 is found. So output is -1.
```

```
Input: arr[] = [1, 1, 2, 8, 10, 11, 12, 19], x = 0
Output: 0
Explanation: Smallest number greater than 0 is 1, whose indices are 0 and 1. The index of the first occurrence is 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T16:04:47.977Z  

```java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        
        // int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= x){
              return  i;
               // break;
            }
        }
        return -1;
    }
}



// given a sorted array arr i.e contains duplicate element  and also given x
// find first greater element or equal to element
// if no then return -1


```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1)