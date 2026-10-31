
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (freq[ch - 'a'] == 0) {
                return false;
            }

            freq[ch - 'a']--;
        }

        return true;
    }
}
