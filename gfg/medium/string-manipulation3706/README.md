# string-manipulation3706

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T18:08:15.372Z  

```java
class Solution {
    public int removeConsecutiveSame(String[] arr) {
        // code here

          int n = arr.length;
          ArrayList<String> ans = new ArrayList<>();
         // int count=0;
          for(int i=0;i<n;i++){
            //  String ch = String.valueOf(arr[i]);

            if(ans.size() == 0){
                ans.add(arr[i]);
            }
           else if(ans.get(ans.size()-1).equals(arr[i])){
                ans.remove(ans.size()-1);
            }else{
                ans.add(arr[i]);
            }
          }

         return ans.size();
    }
};

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/string-manipulation3706/1)