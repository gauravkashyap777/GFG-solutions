class Solution {
    public int missingNumber(int[] arr) {
        // code here
        
        Arrays.sort(arr);
        
        int missing =1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == missing){
                missing++;
            }
        }
        return missing;
    }
}
