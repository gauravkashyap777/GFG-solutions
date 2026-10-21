class Solution {
    public boolean isPossible(int k, int[] a, int[] b) {
        // code here
        
    //     for(int i=0;i<a.length;i++){
    //         //for(int j=0;j<b.length;j++){
    //             if(a[i]+b[i] >= k){
    //                 return true;
    //             }
    //         }
    //   // }
    //     return false;
    
    
              Arrays.sort(a);
              Arrays.sort(b);
              
            //  for(int i=b.length-1;i>=0;i--){
            //      System.out.println(b[i]);
            //  }
           
           for(int i=0;i<a.length;i++){
               if(a[i]+b[b.length-1-i] <k){
                   return false;
               }
           }
           
           return true;
    }
}