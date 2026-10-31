# Ransom Note

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `ransomNote` and `magazine`, return `true` *if* `ransomNote` *can be constructed by using the letters from* `magazine` *and* `false` *otherwise*.

Each letter in `magazine` can only be used once in `ransomNote`.

 

 **Example 1:** 

```
Input: ransomNote = "a", magazine = "b"
Output: false

```

 **Example 2:** 

```
Input: ransomNote = "aa", magazine = "ab"
Output: false

```

 **Example 3:** 

```
Input: ransomNote = "aa", magazine = "aab"
Output: true

```

 

 **Constraints:** 

- 1 <= ransomNote.length, magazine.length <= 105
- ransomNote and magazine consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 62.07%)  
**Memory:** 45.9 MB (beats 92.93%)  
**Submitted:** 2026-10-31T10:42:02.022Z  

```java

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (freq[ch - 'a'] == 0) {
                return false;
            }

            freq[ch - 'a']--;
        }

        return true;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/ransom-note/)