# Daily Temperatures

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `temperatures` represents the daily temperatures, return  *an array*  `answer`  *such that*  `answer[i]`  *is the number of days you have to wait after the*  `ith`  *day to get a warmer temperature*. If there is no future day for which this is possible, keep `answer[i] == 0` instead.

 

 **Example 1:** 

```
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

```

 **Example 2:** 

```
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

```

 **Example 3:** 

```
Input: temperatures = [30,60,90]
Output: [1,1,0]

```

 

 **Constraints:** 

- 1 <= temperatures.length <= 105
- 30 <= temperatures[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 98.96%)  
**Memory:** 104.8 MB (beats 79.66%)  
**Submitted:** 2026-10-19T17:16:17.219Z  

```java
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] answer = new int[n];

        for (int i = n - 2; i >= 0; i--) {

            int j = i + 1;

            while (j < n && temperatures[j] <= temperatures[i]) {

                if (answer[j] == 0) {
                    j = n;
                    break;
                }

                j = j + answer[j];
            }

            if (j < n) {
                answer[i] = j - i;
            }
        }

        return answer;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/daily-temperatures/)