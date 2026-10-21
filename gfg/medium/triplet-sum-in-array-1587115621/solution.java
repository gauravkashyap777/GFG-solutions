class Solution {
	public boolean hasTripletSum(int arr[], int target) {
		// code Here
// 		  Arrays.sort(arr);
// 		for (int i = 0; i<arr.length-2; i++) {
// 			for (int j = i + 1; j<arr.length; j++) {
// 				for (int k = j + 1; k<arr.length; k++) {
// 					if (arr[i]+arr[j]+arr[k] == target) {
// 						return true;
// 					}
// 				}
// 			}
// 		}
// 		return false;
   
   
            Arrays.sort(arr);
            
            for(int i=0;i<arr.length-2;i++){
                int left = i+1;
                int right = arr.length-1;
                
                while(left<right){
                    int sum = arr[i]+arr[left]+arr[right];
                    
                    if(sum==target){
                        return true;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
         return false;
	}
}
