class Solution {
    public char findTheDifference(String s, String t) {

        int n = s.length();
        int m = t.length();

           boolean[] used = new boolean[n];
         //ArrayList<Character> ans = new ArrayList<>();
        for(int j=0;j<m;j++){

            boolean found = false;

            for(int i=0;i<n;i++){

               if(s.charAt(i) == t.charAt(j) && !used[i]){
                
                    found = true;
                used[i] = true;
                    break;
               }
               }
                   if(!found){
                   return t.charAt(j);
                   }
               }
        
        return ' ';

        }
        
        }

// int i=0;
// int j=0;

// ArrayList<Character> ans = new ArrayList<>();
// while(i<s.length() && j<t.length()){

//     if(s.charAt(i) == t.charAt(j)){
//         ans.add(t.charAt(j));
//            i++;
//            j++;
//     }

// }

// return ans.get(0);
