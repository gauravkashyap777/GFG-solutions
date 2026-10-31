# Lowercase to Uppercase

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string s containing only lowercase English letters, convert all its characters to uppercase and return the resulting string.

 **Examples:** 

```
Input: s = "geeks"
Output: GEEKS
Explanation: All lowercase characters are converted to their corresponding uppercase characters.
```

```
Input: s = "geeksforgeeks"
Output: GEEKSFORGEEKS
Explanation: Each lowercase character in the string is converted to uppercase.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T11:00:56.400Z  

```java
class Solution {
    public String toUpper(String s) {
        // code here
        
    //   int ans=0;
    //   for(int i=0;i<s.length();i++){
    //       ans = s.toUpperCase();
    //   }
    //   return ans;
    
          //return s.toUpperCase();
          
          
          StringBuilder sb = new StringBuilder();
          
          for(int i=0;i<s.length();i++){
              char ch = s.charAt(i);
              
              char c = (char)('A'+ch-'a');
              sb.append(c);
          }
          
          return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/lower-case-to-upper-case3410/1)