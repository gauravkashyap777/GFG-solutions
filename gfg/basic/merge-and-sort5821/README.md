# Merge and Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two arrays  **arr1[]** and  **arr2[]**, return the merged array in ascending order containing unique elements.

 **Examples:** 

```
Input: arr1[] = [11, 1, 8], arr2[] = [10, 11]
Output: [1, 8, 10, 11]
Explanation: The ouput array after merging both the arrays and removing duplicates is [1, 8, 10, 11]

```

```
Input: arr1[] = [7, 1, 5, 3, 9], arr2[]  = [8, 4, 3, 5, 2, 6]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9] 
```

 **Constraints:** 
1 ≤ arr1.size(), arr2.size() ≤ 104
0 ≤ arr1[i], arr2[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T16:44:39.452Z  

```java
class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
        
        TreeSet<Integer> list = new TreeSet<>();
        
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        }
            for(int j=0;j<arr2.length;j++){
                list.add(arr2[j]);
            }
               // Arrays.sort(arr1[i][j]);
            
        
       // return list;
       return new ArrayList<>(list);

    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-and-sort5821/1)