# Determine if String Halves Are Alike

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` of even length. Split this string into two halves of equal lengths, and let `a` be the first half and `b` be the second half.

Two strings are  **alike**  if they have the same number of vowels (`'a'`, `'e'`, `'i'`, `'o'`, `'u'`, `'A'`, `'E'`, `'I'`, `'O'`, `'U'`). Notice that `s` contains uppercase and lowercase letters.

Return `true` *if* `a` *and* `b` *are  **alike***. Otherwise, return `false`.

 

 **Example 1:** 

```
Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

```

 **Example 2:** 

```
Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.

```

 

 **Constraints:** 

- 2 <= s.length <= 1000
- s.length is even.
- s consists of uppercase and lowercase letters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 95.51%)  
**Memory:** 42.6 MB (beats 87.92%)  
**Submitted:** 2026-11-03T10:49:22.621Z  

```java
class Solution {
    boolean find(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U'){
            return true;
        }
        return false;
    }
    public boolean halvesAreAlike(String s) {
        

        int i=0;
        int j=s.length()-1;

         int val1=0;
          int val2=0;

        while(i<j){
       
         char char1 =s.charAt(i);
         char char2 =s.charAt(j);

          if(find(char1)){
            val1++;
          }
          if(find(char2)){
            val2++;
          }
          i++;
          j--;
        }
        return val1==val2;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/determine-if-string-halves-are-alike/)