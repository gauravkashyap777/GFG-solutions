class Solution {
    void segregate0and1(int[] arr) {
        // code here
        
       // Arrays.sort(arr);
       
       int n = arr.length;
       int i=0;
       int j = n-1;
       
       while(i<j){
           
           if(arr[i] == 0){
               i++;
           }else if(arr[j] == 1){
               j--;
           }else{
                int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
                  i++;
                  j--;
           }
          
       }

        
    }
}
