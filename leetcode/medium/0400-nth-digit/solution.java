class Solution {
    public int findNthDigit(int n) {
        
      long digit = 1;
      long count = 9;
      long start = 1;

      while( n > digit*count){


         n-=  digit* count;
          digit++;
          count *= 10;
          start *= 10;
      }
        start += (n-1)/digit;

        String num = String.valueOf(start);

        return num.charAt((int) ((n-1) % digit)) - '0';
    }
}

//traverse
//  i will define three digit like for single,double ,for thriplt
//  for single no return that no 
// for double and triplet return zero