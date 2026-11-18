class Solution {

       boolean is_possible(int[] piles,int h,int mid){
                int count =0;

                for(int i=0;i<piles.length;i++){
                    count+= piles[i]/mid;

                    if(piles[i] % mid != 0)
                    count++;

                    if(count> h){
                        return false;
                    }
                }
                return true;
            
            }
    public int minEatingSpeed(int[] piles, int h) {
         
     int l = 1;
     int r = 1000000000;

     int ans =-1;

     while(l<=r){
        int mid = l+(r-l)/2;

        if(is_possible(piles,h,mid) == true){
            ans = mid;
            r = mid-1;
        }else{
            l = mid+1;
        }
     }
        return ans;
    }
}