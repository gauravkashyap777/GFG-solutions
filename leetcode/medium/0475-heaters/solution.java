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