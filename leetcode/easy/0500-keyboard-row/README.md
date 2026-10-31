# Keyboard Row

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of strings `words`, return  *the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below*.

 **Note**  that the strings are  **case-insensitive**, both lowercased and uppercased of the same letter are treated as if they are at the same row.

In the  **American keyboard** :

- the first row consists of the characters "qwertyuiop",
- the second row consists of the characters "asdfghjkl", and
- the third row consists of the characters "zxcvbnm".

 

 **Example 1:** 

 **Input:**  words = ["Hello","Alaska","Dad","Peace"]

 **Output:**  ["Alaska","Dad"]

 **Explanation:** 

Both `"a"` and `"A"` are in the 2nd row of the American keyboard due to case insensitivity.

 **Example 2:** 

 **Input:**  words = ["omk"]

 **Output:**  []

 **Example 3:** 

 **Input:**  words = ["adsdf","sfd"]

 **Output:**  ["adsdf","sfd"]

 

 **Constraints:** 

- 1 <= words.length <= 20
- 1 <= words[i].length <= 100
- words[i] consists of English letters (both lowercase and uppercase).

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.3 MB (beats 91.66%)  
**Submitted:** 2026-10-31T08:59:55.694Z  

```java
class Solution {
    public String[] findWords(String[] words) {
        
        String row0 = "qwertyuiop";
        String row1 = "asdfghjkl";
        String row2 = "zxcvbnm";

       ArrayList<String> ans = new ArrayList<>();
        
         for(String s:words){
            int temp[] = new int[3];
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                char ch = Character.toLowerCase(c);

                 if(row0.indexOf(ch)!= -1){
                    temp[0] = 1;
                }else if(row1.indexOf(ch)!= -1){
                    temp[1] = 1;
                }else{
                    temp[2] = 1;

                }
            }
             if(temp[0] + temp[1] + temp[2] == 1){
                ans.add(s);
             }
        }

          String result[] = new String[ans.size()];
          for(int i=0;i<ans.size();i++){
            result[i] = ans.get(i);
          }
          return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/keyboard-row/)