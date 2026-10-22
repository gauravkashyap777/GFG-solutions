class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
         Arrays.sort(arr);


        int i=0;
        int j = 1;
        while(j<arr.length){
            int diffn = arr[j]-arr[i];
            if(diffn == x){
                return true;

            }else if(diffn > x){
                i++;
            }else{
                j++;
            }
             if (i == j) {
                 j++;
             }
        }
       return false;
    }
}
