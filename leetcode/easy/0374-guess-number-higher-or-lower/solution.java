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