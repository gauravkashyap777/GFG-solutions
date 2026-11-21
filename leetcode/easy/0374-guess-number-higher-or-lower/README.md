# Guess Number Higher or Lower

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We are playing the Guess Game. The game is as follows:

I pick a number from `1` to `n`. You have to guess which number I picked (the number I picked stays the same throughout the game).

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API `int guess(int num)`, which returns three possible results:

- -1: Your guess is higher than the number I picked (i.e. num > pick).
- 1: Your guess is lower than the number I picked (i.e. num < pick).
- 0: your guess is equal to the number I picked (i.e. num == pick).

Return  *the number that I picked*.

 

Original
Java
 **Example 1:** 

```
Input: n = 10, pick = 6
Output: 6

```

 **Example 2:** 

```
Input: n = 1, pick = 1
Output: 1

```

 **Example 3:** 

```
Input: n = 2, pick = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= n <= 231 - 1
- 1 <= pick <= n

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.5 MB (beats 75.53%)  
**Submitted:** 2026-11-21T11:58:24.498Z  

```java
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
    //     Scanner scanner = new Scanner(System.in);
        
    //   // int num = scanner.nextInt();
    //     int pick = scanner.nextInt();

    //     if(n > pick){
    //         System.out.println("your guess is higher than number");
    //     }else if(n<pick){
    //         System.out.println("your guess is lower than the number");
    //      }//else{
    //     // return num;
    //     // }
    //     return n;


         int st =0;
         int end = n;

         while(st<=end){
            int mid = st+(end-st)/2;

            if(guess(mid) == -1){
                end = mid-1;;
            }else if( guess(mid) == 1){
                st = mid+1;
            }else{
                return mid;
            }
         }
             
             // return guess[i];
             return -1;
    }
}


// user pick a number 1 to n , here we guess which number i picked 
// if guess wrong number then we tell u whether number is higher or lower
//  
```

---

[View on LeetCode](https://leetcode.com/problems/guess-number-higher-or-lower/)