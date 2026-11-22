# Nth Digit

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer `n`, return the `nth` digit of the infinite integer sequence `[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,...]`.

 

Original
Java
 **Example 1:** 

```
Input: n = 3
Output: 3

```

 **Example 2:** 

```
Input: n = 11
Output: 0
Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,... is a 0, which is part of the number 10.

```

 

 **Constraints:** 

- 1 <= n <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.3 MB (beats 96.52%)  
**Submitted:** 2026-11-22T14:10:13.942Z  

```java
class Solution {
    public int findNthDigit(int n) {
        
      long digit = 1;
      long count = 9;
      long start = 1;

      while( n > digit*count){


         n-=  digit* count;
          digit++;
          count *= 10;
          start *= 10;
      }
        start += (n-1)/digit;

        String num = String.valueOf(start);

        return num.charAt((int) ((n-1) % digit)) - '0';
    }
}

//traverse
//  i will define three digit like for single,double ,for thriplt
//  for single no return that no 
// for double and triplet return zero
```

---

[View on LeetCode](https://leetcode.com/problems/nth-digit/)