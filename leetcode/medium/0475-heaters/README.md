# Heaters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Winter is coming! During the contest, your first job is to design a standard heater with a fixed warm radius to warm all the houses.

Every house can be warmed, as long as the house is within the heater's warm radius range. 

Given the positions of `houses` and `heaters` on a horizontal line, return  *the minimum radius standard of heaters so that those heaters could cover all houses.* 

 **Notice**  that all the `heaters` follow your radius standard, and the warm radius will be the same.

 

Original
Java
 **Example 1:** 

```
Input: houses = [1,2,3], heaters = [2]
Output: 1
Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.

```

 **Example 2:** 

```
Input: houses = [1,2,3,4], heaters = [1,4]
Output: 1
Explanation: The two heaters were placed at positions 1 and 4. We need to use a radius 1 standard, then all the houses can be warmed.

```

 **Example 3:** 

```
Input: houses = [1,5], heaters = [2]
Output: 3

```

 

 **Constraints:** 

- 1 <= houses.length, heaters.length <= 3 * 104
- 1 <= houses[i], heaters[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 21 ms (beats 35.32%)  
**Memory:** 47.3 MB (beats 85.96%)  
**Submitted:** 2026-11-25T17:26:30.442Z  

```java
class Solution {
    public int findRadius(int[] houses, int[] heaters) {

     
    // Arrays.sort(houses);
     Arrays.sort(heaters);
      
               int radius =0;
     for(int i=0;i<houses.length;i++){
         int left = Integer.MAX_VALUE;
       int right = Integer.MAX_VALUE;

       int st =0;
       int end = heaters.length-1;

       while(st<=end){
        int mid = st+(end-st)/2;
        if(heaters[mid] == houses[i]){
            left =0;
            right =0;
              break;
        }else if(heaters[mid] < houses[i]){
            left = houses[i] - heaters[mid];
            st = mid+1;
        }else{
            right = heaters[mid] - houses[i];
            end = mid-1;
        }

     }
     int minDistance = Math.min(left,right);

     radius = Math.max(radius,minDistance);
     }
     

     return radius;


    }
}


//  we have design a heater with a fixed warm radius for all  houses
//  heater warm  so increase warm radius
//  given posn of house and heater horizontal line 
```

---

[View on LeetCode](https://leetcode.com/problems/heaters/)