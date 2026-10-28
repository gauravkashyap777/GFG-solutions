class Solution {
    // Function to search for a character in the string
    public int searchCharacter(String s, char ch) {
        // code here
        int ans =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ch){
                ans = s.charAt(i);
                return i;
            }
        }
        return -1;
    }
}