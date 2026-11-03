class Solution {
    
    public void solve(int i,int j,String s,HashSet<String> hst){
        while(i>=0 && j<s.length())
        {
            if(s.charAt(i) == s.charAt(j)){
                hst.add(s.substring(i,j+1));
            }
            else{
                break;
            }
            i--;
            j++;
        }
    }
    
    
    public ArrayList<String> palindromicSubstr(String s) {
        // code here
        
        
        HashSet<String> hst = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            solve(i,i+1,s,hst);
            solve(i,i,s,hst);
        }
        return new ArrayList<>(hst);
    }
}