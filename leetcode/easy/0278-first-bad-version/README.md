# First Bad Version

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have `n` versions `[1, 2,..., n]` and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API `bool isBadVersion(version)` which returns whether `version` is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

 

Original
Java
 **Example 1:** 

```
Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.

```

 **Example 2:** 

```
Input: n = 1, bad = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= bad <= n <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 10.84%)  
**Memory:** 41.4 MB (beats 93.74%)  
**Submitted:** 2026-11-15T16:27:24.915Z  

```java
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        

        int st =1;
        int end =n;

        while(st<end){
           int mid = st+(end-st)/2;
            if(isBadVersion(mid)){
                end = mid;
            }
            else{
                st = mid+1;
            }
        }
        return st;
    }
}





//   we are a product manager and i lead a team to develop for new products
//   when any single product is bad then all products are fault
//   









```

---

[View on LeetCode](https://leetcode.com/problems/first-bad-version/)