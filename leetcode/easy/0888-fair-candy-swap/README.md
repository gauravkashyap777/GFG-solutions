# Fair Candy Swap

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Alice and Bob have a different total number of candies. You are given two integer arrays `aliceSizes` and `bobSizes` where `aliceSizes[i]` is the number of candies of the `ith` box of candy that Alice has and `bobSizes[j]` is the number of candies of the `jth` box of candy that Bob has.

Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.

Return a *n integer array* `answer` *where* `answer[0]` *is the number of candies in the box that Alice must exchange, and* `answer[1]` *is the number of candies in the box that Bob must exchange*. If there are multiple answers, you may  **return any**  one of them. It is guaranteed that at least one answer exists.

 

Original
Java
 **Example 1:** 

```
Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]

```

 **Example 2:** 

```
Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]

```

 **Example 3:** 

```
Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]

```

 

 **Constraints:** 

- 1 <= aliceSizes.length, bobSizes.length <= 104
- 1 <= aliceSizes[i], bobSizes[j] <= 105
- Alice and Bob have a different total number of candies.
- There will be at least one valid answer for the given input.

## Solution

**Language:** Java  
**Runtime:** 210 ms (beats 16.69%)  
**Memory:** 48.1 MB (beats 64.18%)  
**Submitted:** 2026-11-12T09:43:30.816Z  

```java
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int n = aliceSizes.length;
        int m = bobSizes.length;

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < n; i++) {

            sumA += aliceSizes[i];
        }
        for (int j = 0; j < m; j++) {
            sumB += bobSizes[j];

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int x = aliceSizes[i];
                int y = bobSizes[j];

                if (sumA - x + y == sumB - y + x) {
                    return new int[] { x, y };
                }
            }
        }

        return new int[] {};

    }
}

//  alice and bob has diffn no of candies given in the alicesizes and bobsizes 
//  they are friends and he want to exchange own product 
// after exchange both have same total amount of candy 
// total amount of candy a person has is the sum of the number of candies in each box they have
//  return an integr array 
```

---

[View on LeetCode](https://leetcode.com/problems/fair-candy-swap/)