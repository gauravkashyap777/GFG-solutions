# Find Smallest Letter Greater Than Target

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of characters `letters` that is sorted in  **non-decreasing order**, and a character `target`. There are  **at least two different**  characters in `letters`.

Return  *the smallest character in* `letters` *that is lexicographically greater than* `target`. If such a character does not exist, return the first character in `letters`.

 

Original
Java
 **Example 1:** 

```
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

```

 **Example 2:** 

```
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

```

 **Example 3:** 

```
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

```

 

 **Constraints:** 

- 2 <= letters.length <= 104
- letters[i] is a lowercase English letter.
- letters is sorted in non-decreasing order.
- letters contains at least two different characters.
- target is a lowercase English letter.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45.1 MB (beats 99.72%)  
**Submitted:** 2026-11-24T13:18:48.782Z  

```java
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        

           // int max = Integer.MIN_VALUE;

        //    for(int i=0;i<letters.length;i++){
        //       char ch = letters[i];
        //    }
        //    for(int i=0;i<letters.length;i++){
        //       if(letters[i] != target){ 
        //        return letters[0];
        //       }

            int st =0;
            int end = letters.length;

            while(st<end){
                int mid = st+(end-st)/2;

                if(letters[mid] == target){
                    st = mid+1;
                }
                else if( letters[mid] < target){
                    st = mid+1;
                }else{
                    end = mid;
                }
            }
           
              return letters[st % letters.length];
    }
}





//       Return the smallest character in letters that is lexicographically greater than target
//  such a character does not exist, return the first character in letters.

 


 //   traverse
 //   if the character does not exist then return first character in letters.
 //   if character is present then return greater letter according to that letter
```

---

[View on LeetCode](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)