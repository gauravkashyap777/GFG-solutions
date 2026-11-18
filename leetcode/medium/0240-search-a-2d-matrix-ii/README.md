# Search a 2D Matrix II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix `matrix`. This matrix has the following properties:

- Integers in each row are sorted in ascending from left to right.
- Integers in each column are sorted in ascending from top to bottom.

 

Original
Java
 **Example 1:** 

```
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

```

 **Example 2:** 

```
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= n, m <= 300
- -109 <= matrix[i][j] <= 109
- All the integers in each row are sorted in ascending order.
- All the integers in each column are sorted in ascending order.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 7.61%)  
**Memory:** 47.7 MB (beats 84.61%)  
**Submitted:** 2026-11-18T09:47:54.091Z  

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-a-2d-matrix-ii/)