class Solution {
    public String toUpper(String s) {
        // code here
        
    //   int ans=0;
    //   for(int i=0;i<s.length();i++){
    //       ans = s.toUpperCase();
    //   }
    //   return ans;
    
          //return s.toUpperCase();
          
          
          StringBuilder sb = new StringBuilder();
          
          for(int i=0;i<s.length();i++){
              char ch = s.charAt(i);
              
              char c = (char)('A'+ch-'a');
              sb.append(c);
          }
          
          return sb.toString();
    }
}