# Valid Perfect Square

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer num, return `true`  *if*  `num`  *is a perfect square or*  `false`  *otherwise*.

A  **perfect square**  is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as `sqrt`.

 

Original
Java
 **Example 1:** 

```
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

```

 **Example 2:** 

```
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

```

 

 **Constraints:** 

- 1 <= num <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.2 MB (beats 96.81%)  
**Submitted:** 2026-11-19T11:05:35.308Z  

```java
class Solution {
    public boolean isPerfectSquare(int num) {


      // int n = num.length;
        int st =0;
        int end =num;


        while(st<=end){
            int mid = st+(end-st)/2;

            if((long)mid *mid == num){
                return true;
            }else if((long)mid * mid < num){
                st = mid+1;
            }else{
                end = mid-1;
            }

            
        }
         return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-perfect-square/)