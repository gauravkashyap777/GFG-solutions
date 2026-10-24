# Insertion Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]** of positive integers.The task is to complete the  **insertsort()**  function which is used to implement Insertion Sort.

 **Examples:** 

```
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: The sorted array will be [1, 3, 4, 7, 9].
```

```
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: The sorted array will be [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
```

```
Input: arr[] = [4, 1, 9]
Output: [1, 4, 9]
Explanation: The sorted array will be [1, 4, 9].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T08:45:55.670Z  

```java
class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
      //  Arrays.sort(arr);
      
      for(int i =0;i<arr.length;i++){
          int j =i;
          
          while(j>0 && arr[j]<arr[j-1]){
              int temp = arr[j];
              arr[j] = arr[j-1];
              arr[j-1] = temp;
              j--;
          }
      }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/insertion-sort/1)