class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        
        // int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= x){
              return  i;
               // break;
            }
        }
        return -1;
    }
}



// given a sorted array arr i.e contains duplicate element  and also given x
// find first greater element or equal to element
// if no then return -1

