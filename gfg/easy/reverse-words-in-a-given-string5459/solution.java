class Solution {
    public String reverseWords(String s) {
        // Code here
        
        String[] words = s.split("\\.");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=words.length-1;i>=0;i--){
            String st = words[i];
            if(st.length()>0){
                if(sb.length()>0){
                    sb.append(".");
                }
                sb.append(st);
            }
        }
        return sb.toString();
    }
}
