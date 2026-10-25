# Two Sum in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  that is sorted in non-decreasing order, along with an integer  **target**. Your task is to find positions of two elements with sum equal to target.

- If such a pair exists, return the positions (index + 1)  of the two elements in increasing order.   
- If no such pair exists, return [-1, -1].

 **Note** : If your answer is correct then the driver code will print "true" otherwise "false". Since there can be multiple answers, the driver code mainly checks whether the pair returned by your code is correct or not.

 **Examples:** 

```
Input: arr[] = [2, 7, 11, 15], target = 9
Output: [1, 2]
Explanation: Since arr[0] + arr[1] = 2 + 7 = 9 equals the target, return their 1-based indices : [1, 2]
```

```
Input: arr[] = [1, 3, 4, 6, 8, 11], target = 10
Output: [3, 4]
Explanation: Since arr[2] + arr[3] = 4 + 6 = 10 equals the target, return their 1-based indices : [3, 4]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T19:10:02.093Z  

```java
class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {

        ArrayList<Integer> ans = new ArrayList<>();

           int i=0;
           int j = arr.length-1;
           
           while(i<j){
               
               if(arr[i] + arr[j] == target){
                   ans.add(i+1);
                   ans.add(j+1);
                   return ans;
                   
               }else if(arr[i] + arr[j] < target){
                   i++;
               }else{
                   j--;
               }
           }
           ans.add(-1);
           ans.add(-1);
           return ans;

    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/two-sum-in-sorted-array/1)