class Solution {
    public int removeConsecutiveSame(String[] arr) {
        // code here

          int n = arr.length;
          ArrayList<String> ans = new ArrayList<>();
         // int count=0;
          for(int i=0;i<n;i++){
            //  String ch = String.valueOf(arr[i]);

            if(ans.size() == 0){
                ans.add(arr[i]);
            }
           else if(ans.get(ans.size()-1).equals(arr[i])){
                ans.remove(ans.size()-1);
            }else{
                ans.add(arr[i]);
            }
          }

         return ans.size();
    }
};
