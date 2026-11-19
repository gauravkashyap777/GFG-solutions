class Solution {
    public boolean isPerfectSquare(int num) {


      // int n = num.length;
        int st =0;
        int end =num;


        while(st<=end){
            int mid = st+(end-st)/2;

            if((long)mid *mid == num){
                return true;
            }else if((long)mid * mid < num){
                st = mid+1;
            }else{
                end = mid-1;
            }

            
        }
         return false;
    }
}